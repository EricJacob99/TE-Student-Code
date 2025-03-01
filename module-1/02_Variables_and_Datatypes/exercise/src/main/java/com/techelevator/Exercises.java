package com.techelevator;

public class Exercises {

    /**
     * For the purposes of this exercise, the following naming rules are tested:
     *
     * Variable names:
     *  - must start with a lowercase character a-z.
     *  - underscore ('_') characters are not allowed.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to camel case them as appropriate.
     *
     * Constant names:
     *  - must start with an uppercase character A-Z.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to upper case them as appropriate.
     *
     * Due to practical limitations, camel case and pascal case are not tested other than checking the first
     * character of the name is lower case for variables and upper case for constants. Your instructor will
     * manually review your solution checking for the correct casing.
     */

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int raccoonsThatGoHome = 2;
		int raccoonsRemaining = raccoonsInWoods - raccoonsThatGoHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfBeesLess = numberOfFlowers - numberOfBees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonsEating = 1;
		int pigeonsArriving = 1;
		int pigeonsRemaining = pigeonsEating + pigeonsArriving;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsArriving = 2;
		int owlsOnFenceTotal = owlsOnFence + owlsArriving;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversRemaining = beaversWorking - beaversSwimming;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucansJoining = 1;
		int toucansTotal = toucansSitting + toucansJoining;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nuts = 2;
		int numberOfExtraSquirrels = squirrelsInTree - nuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarters = 1;
		int dimes = 1;
		int nickels = 2;
		double moneyFound = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int classBrierMuffins = 18;
		int classMacAdamsMuffins = 20;
		int classFlanneryMuffins = 17;
		int muffinsBaked = classBrierMuffins + classMacAdamsMuffins + classFlanneryMuffins;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = 0.24;
		double whistleCost = 0.14;
		double toysCost = yoyoCost + whistleCost;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int marshmallowsTotal = largeMarshmallows + miniMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowAtHiltHouse = 29;
		int inchesOfSnowAtBrecknockSchool = 17;
		int inchesOfExtraSnowAtHiltHouse = inchesOfSnowAtHiltHouse - inchesOfSnowAtBrecknockSchool;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
		double hiltBudget = 10.0;
		double toyTruckCost = 3.0;
		double pencilCaseCost = 2.50;
		double moneyRemaining = hiltBudget - (toyTruckCost + pencilCaseCost);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesInCollection = 16;
		int marblesLost = 7;
		int marblesRemaining = marblesInCollection - marblesLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashells = 19;
		int meganSeashellGoal = 25;
		int seashellsRequired = meganSeashellGoal - meganSeashells;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloons = 17;
		int bradRedBalloons = 8;
		int bradGreenBalloons = bradBalloons - bradRedBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int booksAdded = 10;
		int totalBooksOnShelf = booksOnShelf + booksAdded;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsPerBee = 6;
		int beeNumbers = 8;
		int legsTotal = legsPerBee * beeNumbers;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCost = 0.99;
		int numberOfIceCreamCones = 2;
		double totalIceCreamCost = numberOfIceCreamCones * iceCreamCost;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocksRequired = 125;
		int hiltRocks = 64;
		int rocksRequired = totalRocksRequired - hiltRocks;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int hiltMarblesLost = 15;
		int hiltMarblesTotal = hiltMarbles - hiltMarblesLost;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalDistance = 78;
		int milesTravelled = 32;
		int milesRemaining = totalDistance - milesTravelled;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeShovelingSaturday = 90;
		int timeShovelingSunday = 45;
		int totalTimeShoveling = timeShovelingSaturday + timeShovelingSunday;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double costPerHotDog = 0.50;
		int numberOfHotDogs = 6;
		double totalHotDogCost = numberOfHotDogs * costPerHotDog;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int costPerPencil = 7;
		int hiltPencilBudget = 50;
		int totalPencils = hiltPencilBudget / costPerPencil;

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterflies - orangeButterflies;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double candyPayment = 1.00;
		double candyCost = 0.54;
		double kateChange = candyPayment - candyCost;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInBackyard = 13;
		int treesPlanted = 12;
		int treesTotal = treesInBackyard + treesPlanted;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTillGrandma = 2;
		int hoursTillGrandma = 24 * daysTillGrandma;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimCousins = 4;
		int gumPerCousin = 5;
		int gumNeeded = kimCousins * gumPerCousin;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danBudget = 3.00;
		double candyBarCost = 1.00;
		double moneyLeft = danBudget - candyBarCost;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peoplePerBoat = 3;
		int peopleInLake = boatsInLake * peoplePerBoat;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int legosLost = 57;
		int legosRemaining = ellenLegos - legosLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthurmuffins = 35;
		int arthurMuffinGoal = 83;
		int arthurMuffinsRequired = arthurMuffinGoal - arthurmuffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int willyExtraCrayons = willyCrayons - lucyCrayons;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int stickerPages = 22;
		int totalStickers = stickersOnPage * stickerPages;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakesForSharing = 100;
		int numberOfChildren = 8;
		double cupcakesPerPerson = (double)cupcakesForSharing / numberOfChildren;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int jarCapacity = 6;
		int extraCookies = gingerbreadCookies % jarCapacity;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int numberOfCroissants = 59;
		int numberOfNeighbors = 8;
		int croissantsRemaining = numberOfCroissants % numberOfNeighbors;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookies = 276;
		int trayCapacity = 12;
		int numberOfTrays = oatmealCookies / trayCapacity;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int numberOfPretzels = 480;
		int pretzelsPerServing = 12;
		int numberOfServings = numberOfPretzels / pretzelsPerServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int cupcakesPerBox = 3;
		int totalCupcakeBoxes = (lemonCupcakes - 2) / cupcakesPerBox;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
		int peopleToServe = 12;
		int uneatenCarrotSticks = carrotSticks % peopleToServe;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int shelfCapacity = 7;
		int sshelvesFilled = teddyBears / shelfCapacity;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int familyPictures = 480;
		int albumCapacity = 20;
		int albumsNeeded = familyPictures / albumCapacity;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int boxCapacity = 8;
		int boxesNeeded = tradingCards / boxCapacity;
		int cardsInUnfilledBox = tradingCards % boxCapacity;

        /* Exercise 49
        49. The Milky Way galaxy contains 300 billion stars. The Andromeda galaxy
        contains 1 trillion stars. How many stars do the two galaxies contain combined?
        */
		long starsInMilkyWay = 300000000000l;
		long starsInAndromeda = 1000000000000l;
		long starsInBothGalaxies = starsInAndromeda + starsInMilkyWay;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double christinaCroissants = 17d;
		int numberOfGuests = 7;
		double croissantsPerGuest = christinaCroissants / numberOfGuests;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double billRoomPaintingSpeed = 2.15;
		double jillRoomPaintingSpeed = 1.9;
		int roomsToPaint = 5;
		double paintingTime = roomsToPaint / (1/billRoomPaintingSpeed + 1/jillRoomPaintingSpeed);

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceToTravel = 800.0;
		double distanceTravelled = 537.0;
		int percentageRemaining = (int)(100 * ((double)distanceTravelled / (double)distanceToTravel));
	}

}
