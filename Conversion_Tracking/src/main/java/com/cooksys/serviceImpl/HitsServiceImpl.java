package com.cooksys.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.Hits;
import com.cooksys.entity.URL;
import com.cooksys.repository.HitsRepository;
import com.cooksys.repository.UrlRepository;
import com.cooksys.service.HitsService;

@Service
public class HitsServiceImpl implements HitsService{
	@Autowired
	HitsRepository hitsRepository;
	@Autowired
	UrlRepository urlRepository;
	
	@Override
	public List<Hits> findDate(String date) {
		return hitsRepository.findByDate(date);
	}

	@Override
	public Hits addHit(String date, String label, String type) {
		URL n = urlRepository.findOneByLabel(label);
		if (n == null) {
			n = new URL(label);
			urlRepository.save(n);
		}
		List<Hits> sl = hitsRepository.findByDate(date);
		Hits s = null;
		for (Hits x : sl) {
			if (x.getExtensionURL() == n) {
				s = x;
			}
		}
		if (s == null) {
			n = urlRepository.findByExtensionURL(label);
			s = new Hits(0, date, n);
		}
		if (type.equals("convert")) {
			if (s.getConvertedHits() == null) {
				s.setConvertedHits(0);
			}
			s.setConvertedHits(s.getConvertedHits() + 1);
		} else if (type.equals("signup")) {
			s.setTotalSignups(s.getTotalSignups() + 1);
		} else if (type.equals("anonymous")) {
			if (s.getAnonymousHits() == null) {
				s.setAnonymousHits(0);
			}
			s.setAnonymousHits(s.getAnonymousHits() + 1);
		}
		s.setTotalHits(s.getTotalHits() + 1);
		return hitsRepository.save(s);
	}

	@Override
	public Hits decHit(String date, String label) {
		URL n = urlRepository.findByExtensionURL(label);
		if (n == null) {
			n = new URL(label);
			urlRepository.save(n);
		}
		List<Hits> sl = hitsRepository.findByDate(date);
		Hits s = null;
		for (Hits x : sl) {
			if (x.getExtensionURL() == n) {
				s = x;
			}
		}
		if (s == null) {
			n = urlRepository.findByExtensionURL(label);
			s = new Hits(date, 0, n);
		}
		if (s.getAnonymousHits() < 1) {
			s.setAnonymousHits(0);
		}
		else {
			s.setAnonymousHits(s.getAnonymousHits() - 1);
		}
		return hitsRepository.save(s);
	}

	@Override
	public Hits getHits(String date, String label, String type) {
		List<Hits> listOfHits = null;
		Integer totalHits = 0;
		Integer signups = 0;
		Integer anonHits = 0;
		Integer convHits = 0;
		/*
		 * List of types: total : get total hits (only location needed) daily :
		 * get daily hits (date is optional) week : get weekly hits (only
		 * location needed) month : get monthly hits (only location needed)
		 * 
		 */
		if (type.equals("total") || type.equals("daily")) {
			listOfHits = hitsRepository.findAllByExtensionURL(urlRepository.findByExtensionURL(label));
		}
		if (type.equals("week")) {
			listOfHits = hitsRepository.findBottom7ByExtensionURL(urlRepository.findByExtensionURL(label));
		}
		if (type.equals("month")) {
			listOfHits = hitsRepository.findBottom30ByExtensionURL(urlRepository.findByExtensionURL(label));
		}

		if (type.equals(null)) {
			return null; // let's change this to a error message :)
		}

		else {

			for (Hits hitIt : listOfHits) {
				if (type.equals("daily")) {
					if (hitIt.getDate().equals(date)) {
						totalHits = totalHits + hitIt.getTotalHits();
						anonHits = anonHits + hitIt.getAnonymousHits();
						convHits = convHits + hitIt.getConvertedHits();
						signups = signups + hitIt.getTotalSignups();
					}
				} else {
					totalHits = totalHits + hitIt.getTotalHits();
					anonHits = anonHits + hitIt.getAnonymousHits();
					convHits = convHits + hitIt.getConvertedHits();
					signups = signups + hitIt.getTotalSignups();
				}
			}
			return new Hits(totalHits, anonHits, convHits, signups);
		}

	}

	@Override
	public List<Integer> getViews(String label, String string) {
		List<Hits> listofHits = hitsRepository.findBottom30ByExtensionURL(urlRepository.findByExtensionURL(label));
		List<Integer> integers = new ArrayList<Integer>();
		for (Hits hit : listofHits) {
			if (string.equals("anon")) {
				integers.add(hit.getAnonymousHits());
			}
			if (string.equals("conv")) {
				integers.add(hit.getConvertedHits());
			}
		}
		if (integers.size() < 30) {
			for (int x = integers.size(); x < 30; x++) {
				integers.add(0);
			}
		}
		return integers;
	}

}
