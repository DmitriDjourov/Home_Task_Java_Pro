package org.example;

import java.util.HashSet;
import java.util.Set;

public class GetSearchSubStr {
		public static Set<String> getSearchSubStr (Set<String> setString, String substr){
				Set<String> matchStr = new HashSet<>();
				for (String element : setString){
						if (element.contains(substr)){
								matchStr.add(element);
						}
				}

				return matchStr;
		}
}
