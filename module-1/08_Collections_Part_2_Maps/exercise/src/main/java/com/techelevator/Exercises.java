package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Create and return a Map that contains the following data
	 * of animals and the name of a group of that animal.
	 *
	 * rhino -> crash
	 * giraffe -> tower
	 * elephant -> herd
	 * lion -> pride
	 * crow -> murder
	 * pigeon -> kit
	 * flamingo -> pat
	 * deer -> herd
	 * dog -> pack
	 * crocodile -> float
	 *
	 */
	public Map<String, String> animalGroupName() {
		Map<String,String> animalGroupNames = new HashMap<>();
		animalGroupNames.put("rhino", "crash");
		animalGroupNames.put("giraffe", "tower");
		animalGroupNames.put("elephant", "herd");
		animalGroupNames.put("lion", "pride");
		animalGroupNames.put("crow", "murder");
		animalGroupNames.put("pigeon", "kit");
		animalGroupNames.put("flamingo", "pat");
		animalGroupNames.put("deer", "herd");
		animalGroupNames.put("dog", "pack");
		animalGroupNames.put("crocodile", "float");
		return animalGroupNames;
	}

	/*
	 * Given a Map and a String item number, look for the item number in the Map
	 * and return its value that represents the discount percentage if the item is on sale.
	 *
	 * If the item number isn't in the map, or is empty, or is null, return 0.00 instead.
	 *
	 * For example, the Map might have keys and values such as:
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 *
	 * The item number should be case-insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale({"KITCHEN4001": 0.20, "GARAGE1070": 0.15}, "kitchen4001") → 0.20
	 * isItOnSale({"LIVINGROOM": 0.10, "KITCHEN6073": 0.40}, "") → 0.00
	 * isItOnSale({"BEDROOM3434": 0.60, "GARAGE1070": 0.15}, "GARAGE1070") → 0.15
	 * isItOnSale({"KITCHEN4001": 0.20, "BATH0073": 0.15}, "spaceship9999") → 0.00
	 *
	 */
	public double isItOnSale(Map<String, Double> itemsOnSale, String itemNumber) {
		if (!itemsOnSale.isEmpty() && itemsOnSale.get(itemNumber) != null && itemsOnSale.containsKey(itemNumber.toUpperCase())) {
			return itemsOnSale.get(itemNumber.toUpperCase());
		} else if (itemNumber != null && itemsOnSale.get(itemNumber) == null && itemsOnSale.get(itemNumber.toUpperCase()) != null){
			return itemsOnSale.get(itemNumber.toUpperCase());
		} else {
			return 0.00;
		}
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * robPeterToPayPaul({"Peter": 101, "Paul": 500}) → {"Peter": 51, "Paul": 550}
	 * robPeterToPayPaul({"Peter": 0, "Paul": 500}) → {"Peter": 0, "Paul": 500}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		if (peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000) {
			peterPaul.put("Paul", (peterPaul.get("Paul") + (peterPaul.get("Peter") / 2)));
			peterPaul.put("Peter", (peterPaul.get("Peter") - peterPaul.get("Peter") / 2));
		}
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "Partnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "Partnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			peterPaul.put("Partnership", ((peterPaul.get("Peter") / 4) + (peterPaul.get("Paul") / 4)));
			peterPaul.put("Paul", (peterPaul.get("Paul") - (peterPaul.get("Paul") / 4)));
			peterPaul.put("Peter", (peterPaul.get("Peter") - (peterPaul.get("Peter") / 4)));
		}
		return peterPaul;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where, for every String in the array,
	 * there is an entry whose key is the first character of the string.
	 *
	 * The value of the entry is the last character of the String. If multiple Strings start with the same letter, then the
	 * value for that key should be the later String's last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["code", "bug", "cat"]) → {"b": "g", "c": "t"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> beginningEnding = new HashMap<String, String>();
		for (int i = 0; i < words.length; i++) {
			beginningEnding.put(String.valueOf(words[i].charAt(0)), String.valueOf(words[i].charAt(words[i].length()-1)));
		}
		return (beginningEnding);
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> wordNums = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			int wordAppearances = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i] == words[j]) {
					wordAppearances++;
				}
			}
			wordNums.put(words[i], wordAppearances);
		}
		return (wordNums);
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> intCount = new HashMap<Integer, Integer>();
		for (int i = 0; i < ints.length; i++) {
			int intAppearances = 0;
			for (int j = 0; j < ints.length; j++) {
				if (ints[i] == ints[j]) {
					intAppearances++;
				}
			}
			intCount.put(ints[i], intAppearances);
		}
		return (intCount);
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["apple", "banana", "apple", "carrot", "banana"]) → {"banana": true, "carrot": false, "apple": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> wordNums = new HashMap<String, Boolean>();
		for (int i = 0; i < words.length; i++) {
			boolean wordAppearsTwice = false;
			for (int j = 0; j < words.length; j++) {
				if (words[i] == words[j] && i!=j) {
					wordAppearsTwice = true;
				}
			}
			wordNums.put(words[i], wordAppearsTwice);
		}
		return (wordNums);
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> totalInventory = new HashMap<String, Integer>();
		Set<String> mainKeys = mainWarehouse.keySet();
		Set<String> remoteKeys = remoteWarehouse.keySet();
		for (String mainKey : mainKeys) {
			if (remoteWarehouse.containsKey(mainKey)) {
					totalInventory.put(mainKey, (mainWarehouse.get(mainKey) + remoteWarehouse.get(mainKey)));
				} else {
					totalInventory.put(mainKey, mainWarehouse.get(mainKey));
				}
		}
		for (String remoteKey : remoteKeys) {
			if (!mainWarehouse.containsKey(remoteKey)) {
				totalInventory.put(remoteKey, remoteWarehouse.get(remoteKey));
			}
		}
		return totalInventory;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, its last2 count is the number of times that a subString length 2
	 * appears in the String and also as the last 2 chars of the String.
	 *
	 * We don't count the end subString, so "hixxxhi" has a last2 count of 1, but the subString may overlap a prior
	 * position by one.  For instance, "xxxx" has a count of 2: one pair at position 0, and the second at position 1.
	 * The third pair at position 2 is the end subString, which we don't count.
	 *
	 * Return a Map<String, Integer> where the keys are the Strings from the array and the values are the last2 counts.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> lastTwo = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			int lastTwoCount = 0;
			for (int j = 0; j < words[i].length()-3; j++) {
				String lasTwo = words[i].substring(words[i].length()-2);
				String substring = words[i].substring(j,j+2);
				if (substring.equals(lasTwo)) {
					lastTwoCount++;
				}
			}
			lastTwo.put(words[i], lastTwoCount);
		}
		return lastTwo;
	}

}
