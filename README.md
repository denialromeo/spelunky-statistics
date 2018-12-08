### Anatomy of a Spelunky Save File

Spelunky save files are 3224 bytes large, comprising 806 32-bit (4-byte) integers placed directly after one another.

If we treat the save file as a byte array, here's the index where each value of interest is located.

|Value of interest|Byte Position|
|---|---|
|Total Plays|0|
|Total Deaths|4|
|Normal Wins|8|
|Hell Wins|12|
|High Score|28|
|Fastest Time (ms)|32|
|Average Score|36|
|Level Before Last Death|40|
|Score Before Last Death|48|
|Place Discovered: The Mines|1060|
|Place Discovered: Jungle|1064|
|Place Discovered: Ice Caves|1068|
|Place Discovered: Temple|1072|
|Place Discovered: Hell|1076|
|Place Discovered: Haunted Castle|1080|
|Place Discovered: Black Market|1084|
|Place Discovered: Worm|1088|
|Place Discovered: Mothership|1092|
|Place Discovered: City of Gold|1096|
|Monster Discovered: Snake|1316|
|Monster Discovered: Cobra|1320|
|Monster Discovered: Bat|1324|
|Monster Discovered: Spider|1328|
|Monster Discovered: Spinner Spider|1332|
|Monster Discovered: Giant Spider|1336|
|Monster Discovered: Skeleton|1340|
|Monster Discovered: Scorpion|1344|
|Monster Discovered: Caveman|1348|
|Monster Discovered: Damsel|1352|
|Monster Discovered: Shopkeeper|1356|
|Monster Discovered: Tunnel Man|1360|
|Monster Discovered: Scarab|1364|
|Monster Discovered: Tiki Man|1368|
|Monster Discovered: Frog|1372|
|Monster Discovered: Fire Frog|1376|
|Monster Discovered: Giant Frog|1380|
|Monster Discovered: Mantrap|1384|
|Monster Discovered: Piranha|1388|
|Monster Discovered: Old Bitey|1392|
|Monster Discovered: Killer Bee|1396|
|Monster Discovered: Queen Bee|1400|
|Monster Discovered: Snail|1404|
|Monster Discovered: Monkey|1408|
|Monster Discovered: Golden Monkey|1412|
|Monster Discovered: Jiang Shi|1416|
|Monster Discovered: Green Knight|1420|
|Monster Discovered: Black Knight|1424|
|Monster Discovered: Vampire|1428|
|Monster Discovered: Ghost|1432|
|Monster Discovered: Bacterium|1436|
|Monster Discovered: Worm Egg|1440|
|Monster Discovered: Worm Baby|1444|
|Monster Discovered: Yeti|1448|
|Monster Discovered: Yeti King|1452|
|Monster Discovered: Mammoth|1456|
|Monster Discovered: Alien|1460|
|Monster Discovered: UFO|1464|
|Monster Discovered: Alien Tank|1468|
|Monster Discovered: Alien Lord|1472|
|Monster Discovered: Alien Queen|1476|
|Monster Discovered: Hawk Man|1480|
|Monster Discovered: Croc Man|1484|
|Monster Discovered: Magma Man|1488|
|Monster Discovered: Scorpion Fly|1492|
|Monster Discovered: Mummy|1496|
|Monster Discovered: Anubis|1500|
|Monster Discovered: Anubis II|1504|
|Monster Discovered: Olmec|1508|
|Monster Discovered: Vlad|1512|
|Monster Discovered: Imp|1516|
|Monster Discovered: Devil|1520|
|Monster Discovered: Succubus|1524|
|Monster Discovered: Horse Head|1528|
|Monster Discovered: Ox Face|1532|
|Monster Discovered: King Yama|1536|
|Item Discovered: Rope Pile|1572|
|Item Discovered: Bomb Bag|1576|
|Item Discovered: Bomb Box|1580|
|Item Discovered: Spectacles|1584|
|Item Discovered: Climbing Gloves|1588|
|Item Discovered: Pitcher's Mitt|1592|
|Item Discovered: Spring Shoes|1596|
|Item Discovered: Spike Shoes|1600|
|Item Discovered: Paste|1604|
|Item Discovered: Compass|1608|
|Item Discovered: Mattock|1612|
|Item Discovered: Boomerang|1616|
|Item Discovered: Machete|1620|
|Item Discovered: Crysknife|1624|
|Item Discovered: Web Gun|1628|
|Item Discovered: Shotgun|1632|
|Item Discovered: Freeze Ray|1636|
|Item Discovered: Plasma Cannon|1640|
|Item Discovered: Camera|1644|
|Item Discovered: Teleporter|1648|
|Item Discovered: Parachute|1652|
|Item Discovered: Cape|1656|
|Item Discovered: Jetpack|1660|
|Item Discovered: Shield|1664|
|Item Discovered: Royal Jelly|1668|
|Item Discovered: Idol|1672|
|Item Discovered: Kapala|1676|
|Item Discovered: Udjat Eye|1680|
|Item Discovered: Ankh|1684|
|Item Discovered: Hedjet|1688|
|Item Discovered: Sceptre|1692|
|Item Discovered: Book of the Dead|1696|
|Item Discovered: Vlad's Cape|1700|
|Item Discovered: Vlad's Amulet|1704|
|Trap Discovered: Spikes|1828|
|Trap Discovered: Arrow Trap|1832|
|Trap Discovered: Powder Box|1836|
|Trap Discovered: Boulder|1840|
|Trap Discovered: Tiki Trap|1844|
|Trap Discovered: Acid|1848|
|Trap Discovered: Spring|1852|
|Trap Discovered: Mine|1856|
|Trap Discovered: Turret|1860|
|Trap Discovered: Forcefield|1864|
|Trap Discovered: Crush Trap|1868|
|Trap Discovered: Ceiling Trap|1872|
|Trap Discovered: Spike Ball|1876|
|Trap Discovered: Lava|1880|
|Character Unlocked: Yang|2596|
|Character Unlocked: Meat Boy|2600|
|Character Unlocked: Yellow|2604|
|Character Unlocked: The Jungle Warrior|2608|
|Character Unlocked: Purple|2612|
|Character Unlocked: Van Helsing|2616|
|Character Unlocked: Cyan|2620|
|Character Unlocked: Lime|2624|
|Character Unlocked: The Eskimo|2628|
|Character Unlocked: The Round Girl|2632|
|Character Unlocked: The Ninja|2636|
|Character Unlocked: The Viking|2640|
|Character Unlocked: The Round Boy|2644|
|Character Unlocked: The Cyclops|2648|
|Character Unlocked: The Robot|2652|
|Character Unlocked: The Golden Monk|2656|
|Number Killed: Snakes|2660|
|Number Killed: Spiders|2664|
|Number Killed: Bats|2668|
|Number Killed: Cavemen|2672|
|Number Killed: Damsels|2676|
|Number Killed: Shopkeepers|2680|
|Number Killed: Frogs|2684|
|Number Killed: Mantraps|2688|
|Number Killed: Yetis|2692|
|Number Killed: UFOs|2696|
|Number Killed: Hawk Men|2700|
|Number Killed: Skeletons|2704|
|Number Killed: Piranhas|2708|
|Number Killed: Mummies|2712|
|Number Killed: Monkeys|2716|
|Number Killed: Alien Lords|2720|
|Times Killed: Ghost|2724|
|Number Killed: Giant Spiders|2728|
|Number Killed: Jiang Shis|2732|
|Number Killed: Vampires|2736|
|Number Killed: Fire Frogs|2740|
|Times Killed: Tunnel Man|2744|
|Times Killed: Old Bitey|2748|
|Number Killed: Scarabs|2752|
|Number Killed: Yeti Kings|2756|
|Number Killed: Aliens|2760|
|Number Killed: Magma Men|2764|
|Number Killed: Vlad|2768|
|Number Killed: Scorpions|2772|
|Number Killed: Imps|2776|
|Number Killed: Devils|2780|
|Number Killed: Killer Bees|2784|
|Number Killed: Anubis|2788|
|Number Killed: Queen Bees|2792|
|Number Killed: Bacteria|2796|
|Number Killed: Cobras|2800|
|Number Killed: Spinner Spiders|2804|
|Number Killed: Giant Frogs|2808|
|Number Killed: Mammoths|2812|
|Number Killed: Alien Tanks|2816|
|Number Killed: Tiki Men|2820|
|Number Killed: Scorpion Flies|2824|
|Number Killed: Snails|2828|
|Number Killed: Croc Men|2832|
|Number Killed: Green Knights|2836|
|Number Killed: Worm Eggs|2840|
|Number Killed: Worm Babies|2844|
|Times Killed: Alien Queen|2848|
|Times Killed: Black Knight|2852|
|Number Killed: Golden Monkeys|2856|
|Number Killed: Succubus|2860|
|Times Killed: Horse Head|2864|
|Times Killed: Ox Face|2868|
|Times Killed: Anubis II|2872|
|Times Killed: Olmec|2876|
|Times Killed: King Yama|2880|
|Times Killed By: Snakes|2884|
|Times Killed By: Spiders|2888|
|Times Killed By: Bats|2892|
|Times Killed By: Cavemen|2896|
|Times Killed By: Damsels|2900|
|Times Killed By: Shopkeepers|2904|
|Times Killed By: Frogs|2908|
|Times Killed By: Mantraps|2912|
|Times Killed By: Yetis|2916|
|Times Killed By: UFOs|2920|
|Times Killed By: Hawk Men|2924|
|Times Killed By: Skeletons|2928|
|Times Killed By: Piranhas|2932|
|Times Killed By: Mummies|2936|
|Times Killed By: Monkeys|2940|
|Times Killed By: Alien Lords|2944|
|Times Killed By: Ghost|2948|
|Times Killed By: Giant Spiders|2952|
|Times Killed By: Jiang Shis|2956|
|Times Killed By: Vampires|2960|
|Times Killed By: Fire Frogs|2964|
|Times Killed By: Tunnel Man|2968|
|Times Killed By: Old Bitey|2972|
|Times Killed By: Scarabs|2976|
|Times Killed By: Yeti Kings|2980|
|Times Killed By: Aliens|2984|
|Times Killed By: Magma Men|2988|
|Times Killed By: Vlad|2992|
|Times Killed By: Scorpions|2996|
|Times Killed By: Imps|3000|
|Times Killed By: Devils|3004|
|Times Killed By: Killer Bees|3008|
|Times Killed By: Anubis|3012|
|Times Killed By: Queen Bees|3016|
|Times Killed By: Bacteria|3020|
|Times Killed By: Cobras|3024|
|Times Killed By: Spinner Spiders|3028|
|Times Killed By: Giant Frogs|3032|
|Times Killed By: Mammoths|3036|
|Times Killed By: Alien Tanks|3040|
|Times Killed By: Tiki Men|3044|
|Times Killed By: Scorpion Flies|3048|
|Times Killed By: Snails|3052|
|Times Killed By: Croc Men|3056|
|Times Killed By: Green Knights|3060|
|Times Killed By: Worm Eggs|3064|
|Times Killed By: Worm Babies|3068|
|Times Killed By: Alien Queen|3072|
|Times Killed By: Black Knight|3076|
|Times Killed By: Golden Monkeys|3080|
|Times Killed By: Succubi|3084|
|Times Killed By: Horse Head|3088|
|Times Killed By: Ox Face|3092|
|Times Killed By: Anubis II|3096|
|Times Killed By: Olmec|3100|
|Times Killed By: King Yama|3104|
|Times Killed By: Spikes|3108|
|Times Killed By: Arrow Traps|3112|
|Times Killed By: Powder Boxes|3116|
|Times Killed By: Boulders|3120|
|Times Killed By: Tiki Traps|3124|
|Times Killed By: Acid|3128|
|Times Killed By: Springs|3132|
|Times Killed By: Mines|3136|
|Times Killed By: Turrets|3140|
|Times Killed By: Forcefields|3144|
|Times Killed By: Crush Traps|3148|
|Times Killed By: Ceiling Traps|3152|
|Times Killed By: Lava|3156|
|Times Killed By: Spike Balls|3160|

Note also that values in the save file are stored "Little-Endian", meaning that the hexadecimal value `100a0702` is represented as `02070a10` (see that the order of the bytes is reversed).

### Acknowledgments

The hard work of figuring out the guts of the Spelunky save file was done by [Dexter Döpping](https://github.com/dextercd) for his [Spelunky Save Editor](https://github.com/dextercd/spelunky_save_editor3). Thank you, Dexter!