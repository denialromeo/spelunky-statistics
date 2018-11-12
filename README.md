### Anatomy of a Spelunky Save File

Spelunky save files are 3224 bytes large, comprising 806 32-bit (4-byte) integers placed directly after one another.

If we treat the save file as a byte array, here's the index where each value of interest is located.

|Value of interest|Byte Position|
|---|---|
|Amount of plays|0|
|Amount of deaths|4|
|Normal wins|8|
|Hell wins|12|
|Related to deathmatch unlocks|16|
|Related to deathmatch unlocks|20|
|Related to deathmatch unlocks|24|
|High score|28|
|Fastest time (ms)|32|
|Average score|36|
|Level before last death|40|
|Special level before death|44|
|Score before death|48|
|Killed by|52|
|Items before death|56|
|Items before death|60|
|Items before death|64|
|Items before death|68|
|Cave unlocked? (0 - 2)|536|
|Shortcuts unlocked (0 - 6)|540|
|Second favor completed|544|
|Place discovered: Mines|1060|
|Place discovered: Jungle|1064|
|Place discovered: Ice caves|1068|
|Place discovered: Temple|1072|
|Place discovered: Hell|1076|
|Place discovered: Haunted castle|1080|
|Place discovered: Black market|1084|
|Place discovered: Worm|1088|
|Place discovered: Mothership|1092|
|Place discovered: City of gold|1096|
|Creature discovered: Snake|1316|
|Creature discovered: Cobra|1320|
|Creature discovered: Bat|1324|
|Creature discovered: Spider|1328|
|Creature discovered: Spinner spider|1332|
|Creature discovered: Giant spider|1336|
|Creature discovered: Skeleton|1340|
|Creature discovered: Scorpion|1344|
|Creature discovered: Caveman|1348|
|Creature discovered: Damsel|1352|
|Creature discovered: Shopkeeper|1356|
|Creature discovered: Tunnelman|1360|
|Creature discovered: Scarab|1364|
|Creature discovered: Tiki man|1368|
|Creature discovered: (Blue) frog|1372|
|Creature discovered: Fire (orange) frog|1376|
|Creature discovered: Giant frog|1380|
|Creature discovered: Mantrap|1384|
|Creature discovered: Piranha|1388|
|Creature discovered: Old bitey|1392|
|Creature discovered: Killer bee|1396|
|Creature discovered: Queen bee|1400|
|Creature discovered: Snail|1404|
|Creature discovered: Monkey|1408|
|Creature discovered: Golden monkey|1412|
|Creature discovered: Jiang shi|1416|
|Creature discovered: Green knight|1420|
|Creature discovered: Black knight|1424|
|Creature discovered: Vampire|1428|
|Creature discovered: Ghost|1432|
|Creature discovered: Bacterium|1436|
|Creature discovered: Worm egg|1440|
|Creature discovered: Worm baby|1444|
|Creature discovered: Yeti|1448|
|Creature discovered: Yeti king|1452|
|Creature discovered: Mammoth|1456|
|Creature discovered: Alien|1460|
|Creature discovered: Ufo|1464|
|Creature discovered: Alien tank|1468|
|Creature discovered: Alien lord|1472|
|Creature discovered: Alien queen|1476|
|Creature discovered: Hawk man|1480|
|Creature discovered: Croc man|1484|
|Creature discovered: Magma man|1488|
|Creature discovered: Scorpion fly|1492|
|Creature discovered: Mummy|1496|
|Creature discovered: Anubis|1500|
|Creature discovered: Anubis II|1504|
|Creature discovered: Olmec|1508|
|Creature discovered: Vlad|1512|
|Creature discovered: Imp|1516|
|Creature discovered: Devil|1520|
|Creature discovered: Succubus|1524|
|Creature discovered: Horse head|1528|
|Creature discovered: Ox face|1532|
|Creature discovered: King yama|1536|
|Item discovered: Rope pile|1572|
|Item discovered: Bomb bag|1576|
|Item discovered: Bomb box|1580|
|Item discovered: Spectacles|1584|
|Item discovered: Climbing gloves|1588|
|Item discovered: Pitchers mitt|1592|
|Item discovered: Spring shoes|1596|
|Item discovered: Spike shoes|1600|
|Item discovered: Paste|1604|
|Item discovered: Compass|1608|
|Item discovered: Mattock|1612|
|Item discovered: Boomerang|1616|
|Item discovered: Machete|1620|
|Item discovered: Crysknife|1624|
|Item discovered: Web gun|1628|
|Item discovered: Shotgun|1632|
|Item discovered: Freeze ray|1636|
|Item discovered: Plasma cannon|1640|
|Item discovered: Camera|1644|
|Item discovered: Teleporter|1648|
|Item discovered: Parachute|1652|
|Item discovered: Cape|1656|
|Item discovered: Jetpack|1660|
|Item discovered: Shield|1664|
|Item discovered: Royal jelly|1668|
|Item discovered: Idol|1672|
|Item discovered: Kapala|1676|
|Item discovered: Udjat eye|1680|
|Item discovered: Ankh|1684|
|Item discovered: Hedjet|1688|
|Item discovered: Sceptre|1692|
|Item discovered: Book of the death|1696|
|Item discovered: Vlad's cape|1700|
|Item discovered: Vlad's amulet|1704|
|Trap discovered: Spike|1828|
|Trap discovered: Arrow trap|1832|
|Trap discovered: Powder box|1836|
|Trap discovered: Boulder|1840|
|Trap discovered: Tiki trap|1844|
|Trap discovered: Acid|1848|
|Trap discovered: Spring|1852|
|Trap discovered: Mine|1856|
|Trap discovered: Turret|1860|
|Trap discovered: Forcefield|1864|
|Trap discovered: Crush trap|1868|
|Trap discovered: Ceiling trap|1872|
|Trap discovered: Spike ball|1876|
|Trap discovered: Lava|1880|
|Character unlock: Yang|2596|
|Character unlock: Meat Boy|2600|
|Character unlock: Yellow|2604|
|Character unlock: The Jungle Warrior|2608|
|Character unlock: Purple|2612|
|Character unlock: Van Helsing|2616|
|Character unlock: Cyan|2620|
|Character unlock: Lime|2624|
|Character unlock: The Eskimo|2628|
|Character unlock: The Round Girl|2632|
|Character unlock: The Ninja|2636|
|Character unlock: The Viking|2640|
|Character unlock: The Round Boy|2644|
|Character unlock: The Cyclops|2648|
|Character unlock: The Robot|2652|
|Character unlock: The Golden Monk|2656|
|Kill count: Snakes |2660|
|Kill count: Spiders |2664|
|Kill count: Bats |2668|
|Kill count: Caveman |2672|
|Kill count: Damsels |2676|
|Kill count: Shopkeepers |2680|
|Kill count: (Blue) frogs |2684|
|Kill count: Mantraps |2688|
|Kill count: Yetis |2692|
|Kill count: Ufos |2696|
|Kill count: Hawk man |2700|
|Kill count: Skeletons |2704|
|Kill count: Piranhas |2708|
|Kill count: Mummys |2712|
|Kill count: Monkeys  |2716|
|Kill count: Alien lords |2720|
|Kill count: Ghost |2724|
|Kill count: Giant spiders |2728|
|Kill count: Jiang shis |2732|
|Kill count: Vampires |2736|
|Kill count: Fire (orange) frogs |2740|
|Kill count: Tunnelman |2744|
|Kill count: Old bitey |2748|
|Kill count: Scarabs |2752|
|Kill count: Yeti kings |2756|
|Kill count: Aliens |2760|
|Kill count: Magma man |2764|
|Kill count: Vlads |2768|
|Kill count: Scorpions |2772|
|Kill count: Imps |2776|
|Kill count: Devils |2780|
|Kill count: Killer bees |2784|
|Kill count: Anubises |2788|
|Kill count: Queen bees |2792|
|Kill count: Bacterium |2796|
|Kill count: Cobra |2800|
|Kill count: Spinner spiders |2804|
|Kill count: Giant frogs |2808|
|Kill count: Mammoths |2812|
|Kill count: Alien tanks |2816|
|Kill count: Tiki man |2820|
|Kill count: Scorpion flys |2824|
|Kill count: Snails |2828|
|Kill count: Croc man |2832|
|Kill count: Green knight |2836|
|Kill count: Worm egg |2840|
|Kill count: Worm babys |2844|
|Kill count: Alien queen |2848|
|Kill count: Black knight |2852|
|Kill count: Golden monkeys |2856|
|Kill count: Succubus |2860|
|Kill count: Horse heads|2864|
|Kill count: Ox face|2868|
|Kill count: Anubis II|2872|
|Kill count: Olmec|2876|
|Kill count: King yamas|2880|
|Death count: Snakes|2884|
|Death count: Spiders|2888|
|Death count: Bats|2892|
|Death count: Caveman|2896|
|Death count: Damsels|2900|
|Death count: Shopkeepers|2904|
|Death count: (blue) frogs|2908|
|Death count: Mantraps|2912|
|Death count: Yetis|2916|
|Death count: Ufos|2920|
|Death count: Hawk man|2924|
|Death count: Skeletons|2928|
|Death count: Piranhas|2932|
|Death count: Mummys|2936|
|Death count: Monkeys|2940|
|Death count: Alien lords|2944|
|Death count: Ghost|2948|
|Death count: Giant spiders|2952|
|Death count: Jiang shis|2956|
|Death count: Vampires|2960|
|Death count: Fire (orange) frogs|2964|
|Death count: Tunnelman|2968|
|Death count: Old bitey|2972|
|Death count: Scarabs|2976|
|Death count: Yeti kings|2980|
|Death count: Aliens|2984|
|Death count: Magma man|2988|
|Death count: Vlad|2992|
|Death count: Scorpions|2996|
|Death count: Imps|3000|
|Death count: Devils|3004|
|Death count: Killer bees|3008|
|Death count: Anubis|3012|
|Death count: Queen bees|3016|
|Death count: Bacteriums|3020|
|Death count: Cobras|3024|
|Death count: Spinner spiders|3028|
|Death count: Giant frogs|3032|
|Death count: Mammoths|3036|
|Death count: Alien tanks|3040|
|Death count: Tiki man|3044|
|Death count: Scorpion flys|3048|
|Death count: Snails|3052|
|Death count: Croc man|3056|
|Death count: Green knights|3060|
|Death count: Worm eggs|3064|
|Death count: Worm babys|3068|
|Death count: Alien queens|3072|
|Death count: Black knight|3076|
|Death count: Golden monkeys|3080|
|Death count: Succubi|3084|
|Death count: Horse heads|3088|
|Death count: Ox face|3092|
|Death count: Anubis II|3096|
|Death count: Olmec|3100|
|Death count: King yamas|3104|
|Death count: Spike|3108|
|Death count: Arrow trap|3112|
|Death count: Powder box|3116|
|Death count: Boulder|3120|
|Death count: Tiki trap|3124|
|Death count: Acid|3128|
|Death count: Spring|3132|
|Death count: Mine|3136|
|Death count: Turret|3140|
|Death count: Forcefield|3144|
|Death count: Crush trap|3148|
|Death count: Ceiling trap|3152|
|Death count: Lava|3156|
|Death count: Spike ball|3160|
|Music volume|3164|
|SFX volume|3168|
|Damsel selected|3172|
|Screen brightness|3176|
|Player 1 character 0 - 20|3192|
|Player 2 character 0 - 20|3196|
|Player 3 character 0 - 20|3200|
|Player 4 character 0 - 20|3204|
|Player 1 invert run|3208|
|Player 2 invert run|3212|
|Player 3 invert run|3216|
|Player 4 invert run|3220|

Note also that values in the save file are stored "Little-Endian", meaning that the hexadecimal value `100a0702` is represented as `02070a10` (see that the order of the bytes is reversed). The program must account for this.