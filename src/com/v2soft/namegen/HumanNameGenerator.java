package com.v2soft.namegen;

import java.util.Locale;
import java.util.Random;

/**
 * 
 * @author Vladimir Shcryabets <vshcryabets@gmail.com>
 *
 */
public class HumanNameGenerator {
	private Random mRandom;
	private String[] mSurnames;
	private String[] mFemaleNames;
	private String[] mMaleNames;
	
	public HumanNameGenerator(Locale locale) {
		mRandom = new Random();
		mSurnames = mUSSurnames;
		mFemaleNames = mUSFemaleNames;
		mMaleNames = mUSMaleNames;
	}
	
	/**
	 * Get female name.
	 */
	public String getFemaleName() {
		String surname = mSurnames[mRandom.nextInt(mSurnames.length)];
		String name = mFemaleNames[mRandom.nextInt(mFemaleNames.length)];
		return name+" "+surname;
	}
	/**
	 * Get male name.
	 */
	public String getMaleName() {
		String surname = mSurnames[mRandom.nextInt(mSurnames.length)];
		String name = mMaleNames[mRandom.nextInt(mMaleNames.length)];
		return name+" "+surname;
	}
	// Data
	private static final String mUSSurnames[] = {
		"Smith",
		"Johnson",
		"Williams",
		"Brown",
		"Jones",
		"Miller",
		"Davis",
		"García",
		"Rodríguez",
		"Wilson",
		"Martínez",
		"Anderson",
		"Taylor",
		"Thomas",
		"Hernández",
		"Moore",
		"Martin",
		"Jackson",
		"Thompson",
		"White",
		"López",
		"Lee",
		"González",
		"Harris",
		"Clark",
		"Lewis",
		"Robinson",
		"Walker",
		"Pérez",
		"Hall",
		"Young",
		"Allen",
		"Sánchez",
		"Wright",
		"King",
		"Scott",
		"Green",
		"Baker",
		"Adams",
		"Nelson",
		"Hill",
		"Ramírez",
		"Campbell",
		"Mitchell",
		"Roberts",
		"Carter",
		"Phillips",
		"Evans",
		"Turner",
		"Torres",
		"Parker",
		"Collins",
		"Edwards",
		"Stewart",
		"Flores",
		"Morris",
		"Nguyen",
		"Murphy",
		"Rivera",
		"Cook",
		"Rogers",
		"Morgan",
		"Peterson",
		"Cooper",
		"Reed",
		"Bailey",
		"Bell",
		"Gómez",
		"Kelly",
		"Howard",
		"Ward",
		"Cox",
		"Díaz",
		"Richardson",
		"Wood",
		"Watson",
		"Brooks",
		"Bennett",
		"Gray",
		"James",
		"Reyes",
		"Cruz",
		"Hughes",
		"Price",
		"Myers",
		"Long",
		"Foster",
		"Sanders",
		"Ross",
		"Morales",
		"Powell",
		"Sullivan",
		"Russell",
		"Ortiz",
		"Jenkins",
		"Gutiérrez",
		"Perry",
		"Butler",
		"Barnes",
		"Fisher"
	};
	private static final String mUSFemaleNames[] = {
		"Sophia", "Emma", "Isabella", "Olivia", "Ava", "Emily", "Abigail", "Mia", "Madison", "Elizabeth"
	};
	private static final String mUSMaleNames[] = {
	 	"Jacob", "Mason", "Ethan", "Noah", "William", "Liam", "Jayden", "Michael", "Alexander", "Aiden"
	};
}
