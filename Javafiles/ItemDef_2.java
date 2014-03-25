import java.io.*;

public class ItemDef_2
{

    private ItemDef_2()
    {
    }

    public static ItemDef itemDef(int i, ItemDef itemdef) {
    if(i == 20155) {
    	itemdef.stackable = false;
    	itemdef.name = "Dragonbone Crossbow";
    	itemdef.description ="A Dragonbone Crossbow";
    	itemdef.modelID = 16876;
    	itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 16846;
		itemdef.anInt200 = 16846;
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 323;
		itemdef.modelRotation2 = 323;
        itemdef.groundActions = new String[5];
        itemdef.groundActions[2] = "Take";
        itemdef.itemActions = new String[5];
        itemdef.itemActions[1] = "Wear";
        itemdef.itemActions[4] = "Destroy";
        itemdef.modifiedModelColors = new int[6];
		itemdef.modifiedModelColors[0] = 6447;
		itemdef.modifiedModelColors[1] = 6443;
		itemdef.modifiedModelColors[2] = 6439;
		itemdef.modifiedModelColors[3] = 5656;
		itemdef.modifiedModelColors[4] = 5652;
		itemdef.modifiedModelColors[5] = 5904;
        itemdef.originalModelColors = new int[6];
		itemdef.originalModelColors[0] = 44635;
		itemdef.originalModelColors[1] = 44612;
		itemdef.originalModelColors[2] = 44606;
		itemdef.originalModelColors[3] = 44615;
		itemdef.originalModelColors[4] = 44564;
		itemdef.originalModelColors[5] = 44575;
    }	

    if(i == 15262) {
    	itemdef.stackable = false;
	}


	if (i == 3807) {
		itemdef.stackable = false;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Smoke";
		itemdef.modelZoom = 1200;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 2;
		itemdef.modelOffset2 = -6;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.anInt165 = 67808;
		itemdef.anInt200 = 67808;
		itemdef.modelRotation1 = 348;
		itemdef.modelRotation2 = 1776;
		itemdef.modelID = 67807;
		itemdef.name = "Bills' Bong";
		itemdef.description = "An enchanted bong.";
	}

	if(i == 20102) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelZoom = 570;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 2;
		itemdef.modelOffset2 = -6;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.modelRotation1 = 348;
		itemdef.modelRotation2 = 1776;
		itemdef.modelID = 9933;
		itemdef.name = "Warrior ring (ii)";
		itemdef.description = "An enchanted warrior ring.";
		itemdef.stackable = false;
	}
	if(i == 20106) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9933;
		itemdef.modelZoom = 570;
		itemdef.modelRotation1 = 348;
		itemdef.modelRotation2 = 1776;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 2;
		itemdef.modelOffset2 = -6;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Warrior ring (iii)";
		itemdef.description = "An enchanted warrior ring.";
		itemdef.stackable = false;
	}
	if(i == 20110) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9933;
		itemdef.modelZoom = 570;
		itemdef.modelRotation1 = 348;
		itemdef.modelRotation2 = 1776;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 2;
		itemdef.modelOffset2 = -6;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Warrior ring (iv)";
		itemdef.description = "An enchanted warrior ring.";
		itemdef.stackable = false;
	}
	if(i == 20114) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9933;
		itemdef.modelZoom = 570;
		itemdef.modelRotation1 = 348;
		itemdef.modelRotation2 = 1776;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 2;
		itemdef.modelOffset2 = -6;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Warrior ring (v)";
		itemdef.description = "An enchanted warrior ring.";
		itemdef.stackable = false;
	}
	if(i == 20121) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9933;
		itemdef.modelZoom = 570;
		itemdef.modelRotation1 = 348;
		itemdef.modelRotation2 = 1776;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 2;
		itemdef.modelOffset2 = -6;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Warrior ring (v) (d)";
		itemdef.description = "An enchanted warrior ring.";
		itemdef.stackable = false;
	}
	if(i == 20100) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9932;
		itemdef.modelZoom = 620;
		itemdef.modelRotation1 = 340;
		itemdef.modelRotation2 = 1940;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -13;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Seers ring (ii)";
		itemdef.description = "A enchanted seers ring.";
		itemdef.stackable = false;
	}
	if(i == 20104) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9932;
		itemdef.modelZoom = 620;
		itemdef.modelRotation1 = 340;
		itemdef.modelRotation2 = 1940;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -13;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Seers ring (iii)";
		itemdef.description = "A enchanted seers ring.";
		itemdef.stackable = false;
	}
	if(i == 20108) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9932;
		itemdef.modelZoom = 620;
		itemdef.modelRotation1 = 340;
		itemdef.modelRotation2 = 1940;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -13;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Seers ring (iv)";
		itemdef.description = "A enchanted seers ring.";
		itemdef.stackable = false;
	}
	if(i == 20112) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9932;
		itemdef.modelZoom = 620;
		itemdef.modelRotation1 = 340;
		itemdef.modelRotation2 = 1940;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -13;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Seers ring (v)";
		itemdef.description = "A enchanted seers ring.";
		itemdef.stackable = false;
	}
	if(i == 20122) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9932;
		itemdef.modelZoom = 620;
		itemdef.modelRotation1 = 340;
		itemdef.modelRotation2 = 1940;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -13;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Seers ring (v) (d)";
		itemdef.description = "A enchanted seers ring.";
		itemdef.stackable = false;
	}
	if(i == 20103){
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9931;
		itemdef.modelZoom = 600;
		itemdef.modelRotation1 = 324;
		itemdef.modelRotation2 = 1916;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -15;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Berserker ring (ii)";
		itemdef.description = "A enchanted berserker ring.";
		itemdef.stackable = false;
	}
	if(i == 20107){
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9931;
		itemdef.modelZoom = 600;
		itemdef.modelRotation1 = 324;
		itemdef.modelRotation2 = 1916;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -15;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Berserker ring (iii)";
		itemdef.description = "A enchanted berserker ring.";
		itemdef.stackable = false;
	}
	if(i == 20111){
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9931;
		itemdef.modelZoom = 600;
		itemdef.modelRotation1 = 324;
		itemdef.modelRotation2 = 1916;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -15;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Berserker ring (iv)";
		itemdef.description = "A enchanted berserker ring.";
		itemdef.stackable = false;
	}
	if(i == 20115){
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9931;
		itemdef.modelZoom = 600;
		itemdef.modelRotation1 = 324;
		itemdef.modelRotation2 = 1916;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -15;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Berserker ring (v)";
		itemdef.description = "A enchanted berserker ring.";
		itemdef.stackable = false;
	}
	if(i == 20123){
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9931;
		itemdef.modelZoom = 600;
		itemdef.modelRotation1 = 324;
		itemdef.modelRotation2 = 1916;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 3;
		itemdef.modelOffset2 = -15;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Berserker ring (v) (d)";
		itemdef.description = "A enchanted berserker ring.";
		itemdef.stackable = false;
	}

	if(i == 20101) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9930;
		itemdef.modelZoom = 630;
		itemdef.modelRotation1 = 332;
		itemdef.modelRotation2 = 1904;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 4;
		itemdef.modelOffset2 = -14;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Archer ring (ii)";
		itemdef.description = "A enchanted archer ring.";
		itemdef.stackable = false;
	}
	if(i == 20105) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9930;
		itemdef.modelZoom = 630;
		itemdef.modelRotation1 = 332;
		itemdef.modelRotation2 = 1904;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 4;
		itemdef.modelOffset2 = -14;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Archer ring (iii)";
		itemdef.description = "A enchanted archer ring.";
		itemdef.stackable = false;
	}
	if(i == 20109) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9930;
		itemdef.modelZoom = 630;
		itemdef.modelRotation1 = 332;
		itemdef.modelRotation2 = 1904;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 4;
		itemdef.modelOffset2 = -14;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Archer ring (iv)";
		itemdef.description = "A enchanted archer ring.";
		itemdef.stackable = false;
	}
	if(i == 20113) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9930;
		itemdef.modelZoom = 630;
		itemdef.modelRotation1 = 332;
		itemdef.modelRotation2 = 1904;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 4;
		itemdef.modelOffset2 = -14;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Archer ring (v)";
		itemdef.description = "A enchanted archer ring.";
		itemdef.stackable = false;
	}
	if(i == 20124) {
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 9930;
		itemdef.modelZoom = 630;
		itemdef.modelRotation1 = 332;
		itemdef.modelRotation2 = 1904;
		itemdef.anInt204 = 0;
		itemdef.modelOffset1 = 4;
		itemdef.modelOffset2 = -14;
		itemdef.anInt165 = -1;
		itemdef.anInt200 = -1;
		itemdef.anInt188 = -1;
		itemdef.anInt164 = -1;
		itemdef.anInt175 = -1;
		itemdef.anInt197 = -1;
		itemdef.name = "Archer ring (v)";
		itemdef.description = "A enchanted archer ring.";
		itemdef.stackable = false;
	}



    if(i == 995) {
            itemdef.name = "Coins";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[4] = "Drop";
            itemdef.itemActions[3] = "Add-to-pouch";
    }

	if(i == 1127) {
		itemdef.name = "Rune platebody";
		itemdef.description = "It's a Rune platebody";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 67405;
		itemdef.anInt165 = 66670;
		itemdef.anInt200 = 67063;
		itemdef.modelZoom = 1250;
		itemdef.modelRotation2 = 488;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
	}
	
	if(i == 1079) {
		itemdef.name = "Rune platelegs";
		itemdef.description = "It's a Rune platelegs";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.modelID = 67394;
		itemdef.anInt165 = 66587;
		itemdef.anInt200 = 66970;
		itemdef.modelZoom = 1842;
		itemdef.modelRotation2 = 485;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = -5;
	}

	if(i == 11629) {
		itemdef.modelID = 62789;
		itemdef.name = "The Sword of 1000 Truths";
		itemdef.modelZoom = 850;
		itemdef.anInt165 = 62788;
		itemdef.anInt200 = 62788;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
	}
	if(i == 20141) {
		itemdef.modelID = 62789;
		itemdef.name = "The Sword of 1000 Truths (d)";
		itemdef.modelZoom = 850;
		itemdef.anInt165 = 62788;
		itemdef.anInt200 = 62788;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
	}
		
	if(i == 11349) {
		itemdef.modelID = 2635;
		itemdef.name = "Vestige Partyhat";
		itemdef.description = "Vestige-x";
		itemdef.modelZoom = 440; 
		itemdef.modelRotation1 = 1845; 
		itemdef.modelRotation2 = 121; 
		itemdef.modelOffset1 = 0; 
		itemdef.modelOffset2 = 1; 
		itemdef.value = 1;
		itemdef.anInt165 = 187;
		itemdef.anInt200 = 363;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	    itemdef.modifiedModelColors = new int[1];
	    itemdef.originalModelColors = new int[1];
		itemdef.modifiedModelColors[0] = 926;
		itemdef.originalModelColors[0] = 1;
	}	
	if(i == 4057) {
		itemdef.modelID = 27222;
		itemdef.name = "Respects Crown";
		itemdef.description = "Vestige-x";
		itemdef.modelZoom = 440; 
		itemdef.modelRotation1 = 1845; 
		itemdef.modelRotation2 = 121; 
		itemdef.modelOffset1 = 0; 
		itemdef.modelOffset2 = 1; 
		itemdef.value = 1;
		itemdef.anInt165 = 27221;
		itemdef.anInt200 = 27221;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	    itemdef.modifiedModelColors = new int[1];
	    itemdef.originalModelColors = new int[1];
		itemdef.modifiedModelColors[0] = 926;
		itemdef.originalModelColors[0] = 1;
	}
	
	if(i == 4064) {
		itemdef.modelID = 27212;
		itemdef.name = "Gold Crown";
		itemdef.description = "Vestige-x";
		itemdef.modelZoom = 440; 
		itemdef.modelRotation1 = 1845; 
		itemdef.modelRotation2 = 121; 
		itemdef.modelOffset1 = 0; 
		itemdef.modelOffset2 = 1; 
		itemdef.value = 1;
		itemdef.anInt165 = 27211;
		itemdef.anInt200 = 27211;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	    itemdef.modifiedModelColors = new int[1];
	    itemdef.originalModelColors = new int[1];
		itemdef.modifiedModelColors[0] = 926;
		itemdef.originalModelColors[0] = 1;
	}
	if(i == 4065) {
		itemdef.modelID = 27232;
		itemdef.name = "Red Crown";
		itemdef.description = "Vestige-x";
		itemdef.modelZoom = 440; 
		itemdef.modelRotation1 = 1845; 
		itemdef.modelRotation2 = 121; 
		itemdef.modelOffset1 = 0; 
		itemdef.modelOffset2 = 1; 
		itemdef.value = 1;
		itemdef.anInt165 = 27231;
		itemdef.anInt200 = 27231;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	    itemdef.modifiedModelColors = new int[1];
	    itemdef.originalModelColors = new int[1];
		itemdef.modifiedModelColors[0] = 926;
		itemdef.originalModelColors[0] = 1;
	}
	if(i == 4066) {
		itemdef.modelID = 27242;
		itemdef.name = "Purple Crown";
		itemdef.description = "Vestige-x";
		itemdef.modelZoom = 440; 
		itemdef.modelRotation1 = 1845; 
		itemdef.modelRotation2 = 121; 
		itemdef.modelOffset1 = 0; 
		itemdef.modelOffset2 = 1; 
		itemdef.value = 1;
		itemdef.anInt165 = 27241;
		itemdef.anInt200 = 27241;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	    itemdef.modifiedModelColors = new int[1];
	    itemdef.originalModelColors = new int[1];
		itemdef.modifiedModelColors[0] = 926;
		itemdef.originalModelColors[0] = 1;
	}

if(i == 11644) {
	itemdef.name = "Blue Samurai Sword";
	itemdef.description = "Sharp AF..";
	itemdef.modelID = 75883; 
	itemdef.anInt165 = 75883; 
	itemdef.anInt200 = 75883; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}

if(i == 11653) {
	itemdef.name = "Pink Lightsaber";
	itemdef.description = "Courtesy of StarWars.";
	itemdef.modelID = 75893; 
	itemdef.anInt165 = 75893; 
	itemdef.anInt200 = 75893; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}	

if(i == 11654) {
itemdef.name = "Blue Lightsaber";
	itemdef.description = "Courtesy of StarWars.";
	itemdef.modelID = 75886; 
	itemdef.anInt165 = 75886; 
	itemdef.anInt200 = 75886; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 11651) {
	itemdef.name = "Red Lightsaber";
	itemdef.description = "Courtesy of StarWars.";
	itemdef.modelID = 75879; 
	itemdef.anInt165 = 75879; 
	itemdef.anInt200 = 75879; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 11652) {
itemdef.name = "Gold Lightsaber";
	itemdef.description = "Courtesy of StarWars.";
	itemdef.modelID = 75888; 
	itemdef.anInt165 = 75888; 
	itemdef.anInt200 = 75888; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 11630) {
	itemdef.name = "Blade Of Destruction";
	itemdef.description = "Its a Blade of Destruction.";
	itemdef.modelID = 75867; 
	itemdef.anInt165 = 75867; 
	itemdef.anInt200 = 75867; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 4645) {
	itemdef.name = "Royal Blade";
	itemdef.description = "Its a Royal Blade.";
	itemdef.modelID = 49101; 
	itemdef.anInt165 = 49102; 
	itemdef.anInt200 = 49102; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}

if(i == 4633) {
	itemdef.name = "Colourful Blade";
	itemdef.description = "Its a Colourful Blade.";
	itemdef.modelID = 28776; 
	itemdef.anInt165 = 28777; 
	itemdef.anInt200 = 28777; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 20144) {
	itemdef.name = "Blade Of Destruction (d)";
	itemdef.description = "Its a Blade of Destruction.";
	itemdef.modelID = 75867; 
	itemdef.anInt165 = 75867; 
	itemdef.anInt200 = 75867; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 11638) {
	itemdef.name = "Google Chrome Sword";
	itemdef.description = "Courtesy of google.";
	itemdef.modelID = 75878; 
	itemdef.anInt165 = 75878; 
	itemdef.anInt200 = 75878; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 20140) {
	itemdef.name = "Google Chrome Sword (d)";
	itemdef.description = "Courtesy of google.";
	itemdef.modelID = 75878; 
	itemdef.anInt165 = 75878; 
	itemdef.anInt200 = 75878; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation1 = 336;
	itemdef.modelRotation2 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 11650) {
	itemdef.name = "Superb Longsword";
	itemdef.description = "Its a Suberb longsword.";
	itemdef.modelID = 13084; 
	itemdef.anInt165 = 13083; 
	itemdef.anInt200 = 13083; 
	itemdef.modelZoom = 1957;
	itemdef.modelRotation1 = 498;
	itemdef.modelRotation2 = 484;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 20143) {
	itemdef.name = "Superb Longsword (d)";
	itemdef.description = "Its a Suberb longsword.";
	itemdef.modelID = 13084; 
	itemdef.anInt165 = 13083; 
	itemdef.anInt200 = 13083; 
	itemdef.modelZoom = 1957;
	itemdef.modelRotation1 = 498;
	itemdef.modelRotation2 = 484;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}

if(i == 11147) {
itemdef.modelID = 5412;
itemdef.name = "Cyan Whip";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modelZoom = 840;
itemdef.anInt165 = 5409;
itemdef.anInt200 = 5409;
itemdef.modelRotation1 = 280;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = -2;
itemdef.modelOffset2 = 56;
itemdef.aByte205 = 7;
itemdef.aByte154 = -7;
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 944;
itemdef.originalModelColors[0] = 34503;
}
if(i == 20082) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 57300;
itemdef.modelID = 2438;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 3188;
itemdef.anInt200 = 3192;
itemdef.name = "Hot h'ween Mask";
itemdef.description = "Aaaarrrghhh... I'm a monster.";
}
if(i == 20083) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 32895;
itemdef.modelID = 2438;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 3188;
itemdef.anInt200 = 3192;
itemdef.name = "Random h'ween Mask";
itemdef.description = "Aaaarrrghhh... I'm a monster.";
}
if(i == 20084) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 6073;
itemdef.modelID = 2438;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 3188;
itemdef.anInt200 = 3192;
itemdef.name = "Orange h'ween Mask";
itemdef.description = "Aaaarrrghhh... I'm a monster.";
}
if(i == 19960) {
			itemdef.name = "Vestige Wings";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 45000;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 45000;
			itemdef.anInt200 = 45000;
			itemdef.description = "wings";
			}
			if(i == 20137) {
				itemdef.name = "Vestige Wings (d)";
				itemdef.itemActions = new String[5];
				itemdef.itemActions[1] = "Wear";
				itemdef.modelID = 45000;
				itemdef.modelZoom = 1312;
				itemdef.modelRotation1 = 350;
				itemdef.modelRotation2 = 2000;
				itemdef.modelOffset2 = -35;
				itemdef.modelOffset1 = 5;
				itemdef.anInt204 = 0;
				itemdef.anInt165 = 45000;
				itemdef.anInt200 = 45000;
				itemdef.description = "wings";
			}

			if(i == 979) {
			itemdef.name = "Vestige Winged Cape";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 75999;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 75999;
			itemdef.anInt200 = 75999;
			itemdef.description = "A custom winged cape.";
			}
			if(i == 20129) {
			itemdef.name = "Vestige Winged Cape (d)";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 75999;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 75999;
			itemdef.anInt200 = 75999;
			itemdef.description = "A custom winged cape.";
			}
			if(i == 4630) {
			itemdef.name = "Devil tail";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 27864;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 27863;
			itemdef.anInt200 = 27863;
			itemdef.description = "A Devil Tail ;) ";
			itemdef.stackable = false;
			}
			if(i == 4631) {
			itemdef.name = "Devil horns";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 27874;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 27873;
			itemdef.anInt200 = 27873;
			itemdef.description = "A Pair of Devil Horns ;) ";
			itemdef.stackable = false;
			}

			if(i == 11596){
		      itemdef.modelID = 74004;
		      itemdef.name = "Colourful Partyhat";
		      itemdef.description = "A Colourful Partyhat";
		      itemdef.modelZoom = 440;
		      itemdef.modelRotation1 = 1845;
		      itemdef.modelRotation2 = 121;
		      itemdef.modelOffset1 = 0;
		      itemdef.modelOffset2 = 1;
		      itemdef.anInt165 = 74005;
		      itemdef.anInt200 = 74005;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.stackable = false;
			}

			if(i == 4647){
		      itemdef.modelID = 58001;
		      itemdef.name = "Black & White Partyhat";
		      itemdef.description = "A Black & White Partyhat";
		      itemdef.modelZoom = 440;
		      itemdef.modelRotation1 = 1845;
		      itemdef.modelRotation2 = 121;
		      itemdef.modelOffset1 = 0;
		      itemdef.modelOffset2 = 1;
		      itemdef.anInt165 = 58000;
		      itemdef.anInt200 = 58000;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.stackable = false;
			}
			if(i == 4648){
		      itemdef.modelID = 58005;
		      itemdef.name = "Multicoloured Partyhat";
		      itemdef.description = "A Multicoloured Partyhat";
		      itemdef.modelZoom = 440;
		      itemdef.modelRotation1 = 1845;
		      itemdef.modelRotation2 = 121;
		      itemdef.modelOffset1 = 0;
		      itemdef.modelOffset2 = 1;
		      itemdef.anInt165 = 58004;
		      itemdef.anInt200 = 58004;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
		      itemdef.stackable = false;
			}

			if(i == 20133){
		      itemdef.modelID = 74004;
		      itemdef.name = "Colourful Partyhat (d)";
		      itemdef.description = "A Colourful Partyhat";
		      itemdef.modelZoom = 440;
		      itemdef.modelRotation1 = 1845;
		      itemdef.modelRotation2 = 121;
		      itemdef.modelOffset1 = 0;
		      itemdef.modelOffset2 = 1;
		      itemdef.anInt165 = 74005;
		      itemdef.anInt200 = 74005;
		      itemdef.groundActions = new String[5];
		      itemdef.groundActions[2] = "Take";
		      itemdef.itemActions = new String[5];
		      itemdef.itemActions[1] = "Wear";
			}

			if(i == 11149) {
            itemdef.modelID = 75072;
            itemdef.name = "Superman Cape";
            itemdef.description = "A cape worn by superman";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 75072;
            itemdef.anInt200 = 75072;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        	}
			if(i == 20139) {
            itemdef.modelID = 75072;
            itemdef.name = "Superman Cape (d)";
            itemdef.description = "A cape worn by superman";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 75072;
            itemdef.anInt200 = 75072;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        	}

        	if(i == 11148) {
			itemdef.modelID = 5412;
			itemdef.name = "Elemental Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
			itemdef.anInt165 = 5409;
			itemdef.anInt200 = 5409;
			itemdef.modelRotation1 = 280;
			itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
			itemdef.modifiedModelColors = new int[1];
			itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 51120;
			}

        	if(i == 20154) {
			itemdef.modelID = 5412;
			itemdef.name = "Elemental Whip (d)";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
			itemdef.anInt165 = 5409;
			itemdef.anInt200 = 5409;
			itemdef.modelRotation1 = 280;
			itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
			itemdef.modifiedModelColors = new int[1];
			itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 51120;
			}

			if(i == 19959) {
			itemdef.name = "Angel Wings";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 4978;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 4978;
			itemdef.anInt200 = 4978;
			itemdef.description = "wings";
			}
			if(i == 20138) {
			itemdef.name = "Angel Wings (d)";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelID = 4978;
			itemdef.modelZoom = 1312;
			itemdef.modelRotation1 = 350;
			itemdef.modelRotation2 = 2000;
			itemdef.modelOffset2 = -35;
			itemdef.modelOffset1 = 5;
			itemdef.anInt204 = 0;
			itemdef.anInt165 = 4978;
			itemdef.anInt200 = 4978;
			itemdef.description = "wings";
			}
			if(i == 20085) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 11200;
itemdef.modelID = 2438;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 3188;
itemdef.anInt200 = 3192;
itemdef.name = "Yellow h'ween Mask";
itemdef.description = "Aaaarrrghhh... I'm a monster.";
}
if(i == 20081) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 34503;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt175 = 29;
itemdef.anInt197 = 87;
itemdef.name = "Cyan Party Hat";
itemdef.description = "A Cyan Party Hat.";
}
if(i == 20080) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 34503;
itemdef.modelID = 2438;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 3188;
itemdef.anInt200 = 3192;
itemdef.name = "Winter h'ween Mask";
itemdef.description = "Aaaarrrghhh... I'm a monster.";
}
if(i == 20079) {
		itemdef.modelID = 68989;
		itemdef.name = "Gold chain";
		itemdef.description = "It's a Gold chain.";
		itemdef.modelZoom = 2500;
		itemdef.modelRotation1 = 498;
		itemdef.modelRotation2 = 1300;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 68990;
		itemdef.anInt200 = 68990;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 20136) {
		itemdef.modelID = 68989;
		itemdef.name = "Gold chain (d)";
		itemdef.description = "It's a Gold chain.";
		itemdef.modelZoom = 2500;
		itemdef.modelRotation1 = 498;
		itemdef.modelRotation2 = 1300;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 68990;
		itemdef.anInt200 = 68990;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
	if(i == 20087) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 933;
itemdef.originalModelColors[0] = 17350;
itemdef.modelID = 2537;
itemdef.modelZoom = 540;
itemdef.modelRotation1 = 72;
itemdef.modelRotation2 = 136;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 189;
itemdef.anInt200 = 366;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Lime santa hat";
itemdef.description = "It's a Lime santa hat.";
}
	if(i == 4649) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modelID = 58013;
itemdef.modelZoom = 540;
itemdef.modelRotation1 = 72;
itemdef.modelRotation2 = 136;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 58012;
itemdef.anInt200 = 58012;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Rainbow santa hat";
itemdef.description = "It's a Rainbow santa hat.";
}
if(i == 20086) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 933;
itemdef.originalModelColors[0] = 6073;
itemdef.modelID = 2537;
itemdef.modelZoom = 540;
itemdef.modelRotation1 = 72;
itemdef.modelRotation2 = 136;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 189;
itemdef.anInt200 = 366;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Lava santa hat";
itemdef.description = "It's a Lava santa hat.";
}
if(i == 20089) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 933;
itemdef.originalModelColors[0] = 6020;
itemdef.modelID = 2537;
itemdef.modelZoom = 540;
itemdef.modelRotation1 = 72;
itemdef.modelRotation2 = 136;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 189;
itemdef.anInt200 = 366;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Black santa hat";
itemdef.description = "It's a Black santa hat.";
}
if(i == 20088) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 933;
itemdef.originalModelColors[0] = 100;
itemdef.modelID = 2537;
itemdef.modelZoom = 540;
itemdef.modelRotation1 = 72;
itemdef.modelRotation2 = 136;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 189;
itemdef.anInt200 = 366;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "White santa hat";
itemdef.description = "It's a White santa hat.";
}
if(i == 20091) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 6073;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Lava partyhat";
itemdef.description = "It's a Lava partyhat.";
}
if(i == 20090) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 933;
itemdef.originalModelColors[0] = 57300;
itemdef.modelID = 2537;
itemdef.modelZoom = 540;
itemdef.modelRotation1 = 72;
itemdef.modelRotation2 = 136;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 189;
itemdef.anInt200 = 366;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Pink santa hat";
itemdef.description = "It's a Pink santa hat.";
}
if(i == 20092) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 17350;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Lime partyhat";
itemdef.description = "It's a Lime partyhat.";
}
if(i == 20093) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 6020;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Black partyhat";
itemdef.description = "It's a Black partyhat.";
}
if(i == 20095) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 6028;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Bronze partyhat";
itemdef.description = "It's a Bronze partyhat.";
}
if(i == 20094) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 33;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Iron partyhat";
itemdef.description = "It's a Iron partyhat.";
}
if(i == 20097) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 196608;
itemdef.modelID = 2438;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 3188;
itemdef.anInt200 = 3192;
itemdef.name = "Black h'ween Mask";
itemdef.description = "Aaaarrrghhh... I'm a monster.";
}
if(i == 4632) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modelID = 27888;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 27887;
itemdef.anInt200 = 27887;
itemdef.name = "Pink Tophat";
itemdef.description = "A Pink Tophat.";
itemdef.stackable = false;
}

if(i == 4634) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modelID = 33308;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 33340;
itemdef.anInt200 = 33340;
itemdef.name = "Sheep Mask";
itemdef.description = "A Sheep Mask.";
itemdef.stackable = false;
}
if(i == 13198) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modelID = 72058;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 72059;
itemdef.anInt200 = 72059;
itemdef.name = "Pig Mask";
itemdef.description = "A Pig Mask.";
itemdef.stackable = false;
}

if(i == 4635) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modelID = 33309;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 33341;
itemdef.anInt200 = 33341;
itemdef.name = "Wolf Mask";
itemdef.description = "A Wolf Mask.";
itemdef.stackable = false;
}

if(i == 4636) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modelID = 33312;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 33342;
itemdef.anInt200 = 33342;
itemdef.name = "Cat Mask";
itemdef.description = "A Cat Mask.";
itemdef.stackable = false;
}

if(i == 4637) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
itemdef.modelID = 33316;
itemdef.modelZoom = 730;
itemdef.modelRotation1 = 516;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = -10;
itemdef.anInt165 = 33339;
itemdef.anInt200 = 33339;
itemdef.name = "Fox Mask";
itemdef.description = "A Fox Mask.";
itemdef.stackable = false;
}


if(i == 20096) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.originalModelColors = new int[1];
itemdef.modifiedModelColors[0] = 926;
itemdef.originalModelColors[0] = 57300;
itemdef.modelID = 2635;
itemdef.modelZoom = 440;
itemdef.modelRotation1 = 76;
itemdef.modelRotation2 = 1850;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = 1;
itemdef.modelOffset2 = 0;
itemdef.anInt165 = 187;
itemdef.anInt200 = 363;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Pink partyhat";
itemdef.description = "It's a Pink partyhat.";
}

if(i == 19952) {
itemdef.modelID = 40920;
itemdef.name = "Pink Spirit Shield";
itemdef.description = "It's a Spirit Shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 44635;
itemdef.originalModelColors[0] = 62135;
itemdef.modifiedModelColors[1] = 44612;
itemdef.originalModelColors[1] = 62135;
itemdef.modifiedModelColors[2] = 44606;
itemdef.originalModelColors[2] = 62135;
itemdef.modifiedModelColors[3] = 44615;
itemdef.originalModelColors[3] = 62135;
itemdef.modifiedModelColors[4] = 44641;
itemdef.originalModelColors[4] = 62135;
itemdef.modifiedModelColors[5] = 44564;
itemdef.originalModelColors[5] = 62135;
itemdef.modifiedModelColors[6] = 44575;
itemdef.originalModelColors[6] = 62135;
itemdef.modifiedModelColors[7] = 44618;
itemdef.originalModelColors[7] = 62135;
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 6073;
itemdef.modifiedModelColors[9] = 44603;
itemdef.originalModelColors[9] = 62135;
itemdef.modifiedModelColors[10] = 44570;
itemdef.originalModelColors[10] = 62135;
itemdef.modifiedModelColors[11] = 4500;
itemdef.originalModelColors[11] = 62135;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
if(i == 20125) {
itemdef.modelID = 40920;
itemdef.name = "Pink Spirit Shield (d)";
itemdef.description = "It's a Spirit Shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 44635;
itemdef.originalModelColors[0] = 62135;
itemdef.modifiedModelColors[1] = 44612;
itemdef.originalModelColors[1] = 62135;
itemdef.modifiedModelColors[2] = 44606;
itemdef.originalModelColors[2] = 62135;
itemdef.modifiedModelColors[3] = 44615;
itemdef.originalModelColors[3] = 62135;
itemdef.modifiedModelColors[4] = 44641;
itemdef.originalModelColors[4] = 62135;
itemdef.modifiedModelColors[5] = 44564;
itemdef.originalModelColors[5] = 62135;
itemdef.modifiedModelColors[6] = 44575;
itemdef.originalModelColors[6] = 62135;
itemdef.modifiedModelColors[7] = 44618;
itemdef.originalModelColors[7] = 62135;
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 6073;
itemdef.modifiedModelColors[9] = 44603;
itemdef.originalModelColors[9] = 62135;
itemdef.modifiedModelColors[10] = 44570;
itemdef.originalModelColors[10] = 62135;
itemdef.modifiedModelColors[11] = 4500;
itemdef.originalModelColors[11] = 62135;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
if(i == 19931) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.modifiedModelColors[0] = 127;
itemdef.originalModelColors = new int[1];
itemdef.originalModelColors[0] = 944;
itemdef.modelID = 19586;
itemdef.modelZoom = 840;
itemdef.modelRotation1 = 280;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = -2;
itemdef.modelOffset2 = 56;
itemdef.anInt165 = 19587;
itemdef.anInt200 = 19587;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Brutal Whip";
itemdef.description = "A Brutal Whip";
itemdef.stackable = false;
}
if(i == 20130) {
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.modifiedModelColors = new int[1];
itemdef.modifiedModelColors[0] = 127;
itemdef.originalModelColors = new int[1];
itemdef.originalModelColors[0] = 944;
itemdef.modelID = 19586;
itemdef.modelZoom = 840;
itemdef.modelRotation1 = 280;
itemdef.modelRotation2 = 0;
itemdef.anInt204 = 0;
itemdef.modelOffset1 = -2;
itemdef.modelOffset2 = 56;
itemdef.anInt165 = 19587;
itemdef.anInt200 = 19587;
itemdef.anInt188 = -1;
itemdef.anInt164 = -1;
itemdef.anInt175 = -1;
itemdef.anInt197 = -1;
itemdef.name = "Brutal Whip (d)";
itemdef.description = "A Brutal Whip";
itemdef.stackable = false;
}

if(i == 19961) {
itemdef.modelID = 40920;
itemdef.name = "White Spirit Shield";
itemdef.description = "It's a Spirit Shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 44635;
itemdef.originalModelColors[0] = 32895;
itemdef.modifiedModelColors[1] = 44612;
itemdef.originalModelColors[1] = 32895;
itemdef.modifiedModelColors[2] = 44606;
itemdef.originalModelColors[2] = 32895;
itemdef.modifiedModelColors[3] = 44615;
itemdef.originalModelColors[3] = 32895;
itemdef.modifiedModelColors[4] = 44641;
itemdef.originalModelColors[4] = 32895;
itemdef.modifiedModelColors[5] = 44564;
itemdef.originalModelColors[5] = 32895;
itemdef.modifiedModelColors[6] = 44575;
itemdef.originalModelColors[6] = 32895;
itemdef.modifiedModelColors[7] = 44618;
itemdef.originalModelColors[7] = 32895;
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 6073;
itemdef.modifiedModelColors[9] = 44603;
itemdef.originalModelColors[9] = 32895;
itemdef.modifiedModelColors[10] = 44570;
itemdef.originalModelColors[10] = 32895;
itemdef.modifiedModelColors[11] = 4500;
itemdef.originalModelColors[11] = 32895;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
if(i == 20128) {
itemdef.modelID = 40920;
itemdef.name = "White Spirit Shield (d)";
itemdef.description = "It's a Spirit Shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 44635;
itemdef.originalModelColors[0] = 32895;
itemdef.modifiedModelColors[1] = 44612;
itemdef.originalModelColors[1] = 32895;
itemdef.modifiedModelColors[2] = 44606;
itemdef.originalModelColors[2] = 32895;
itemdef.modifiedModelColors[3] = 44615;
itemdef.originalModelColors[3] = 32895;
itemdef.modifiedModelColors[4] = 44641;
itemdef.originalModelColors[4] = 32895;
itemdef.modifiedModelColors[5] = 44564;
itemdef.originalModelColors[5] = 32895;
itemdef.modifiedModelColors[6] = 44575;
itemdef.originalModelColors[6] = 32895;
itemdef.modifiedModelColors[7] = 44618;
itemdef.originalModelColors[7] = 32895;
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 6073;
itemdef.modifiedModelColors[9] = 44603;
itemdef.originalModelColors[9] = 32895;
itemdef.modifiedModelColors[10] = 44570;
itemdef.originalModelColors[10] = 32895;
itemdef.modifiedModelColors[11] = 4500;
itemdef.originalModelColors[11] = 32895;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}

if(i == 19953) {
itemdef.modelID = 40920;
itemdef.name = "DragonBone shield";
itemdef.description = "It's a Spirit shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 44635;
itemdef.originalModelColors[0] = 44635;
itemdef.modifiedModelColors[1] = 44612;
itemdef.originalModelColors[1] = 44612;
itemdef.modifiedModelColors[2] = 44606;
itemdef.originalModelColors[2] = 44606;
itemdef.modifiedModelColors[3] = 44615;
itemdef.originalModelColors[3] = 44615;
itemdef.modifiedModelColors[4] = 44641;
itemdef.originalModelColors[4] = 6028;
itemdef.modifiedModelColors[5] = 44564;
itemdef.originalModelColors[5] = 44564;
itemdef.modifiedModelColors[6] = 44575;
itemdef.originalModelColors[6] = 44575;
itemdef.modifiedModelColors[7] = 44618;
itemdef.originalModelColors[7] = 44618;
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 1;
itemdef.modifiedModelColors[9] = 44603;
itemdef.originalModelColors[9] = 44603;
itemdef.modifiedModelColors[10] = 44570;
itemdef.originalModelColors[10] = 6028;
itemdef.modifiedModelColors[11] = 4500;
itemdef.originalModelColors[11] = 4500;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
if(i == 20127) {
itemdef.modelID = 40920;
itemdef.name = "DragonBone shield (d)";
itemdef.description = "It's a Spirit shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 44635;
itemdef.originalModelColors[0] = 44635;
itemdef.modifiedModelColors[1] = 44612;
itemdef.originalModelColors[1] = 44612;
itemdef.modifiedModelColors[2] = 44606;
itemdef.originalModelColors[2] = 44606;
itemdef.modifiedModelColors[3] = 44615;
itemdef.originalModelColors[3] = 44615;
itemdef.modifiedModelColors[4] = 44641;
itemdef.originalModelColors[4] = 6028;
itemdef.modifiedModelColors[5] = 44564;
itemdef.originalModelColors[5] = 44564;
itemdef.modifiedModelColors[6] = 44575;
itemdef.originalModelColors[6] = 44575;
itemdef.modifiedModelColors[7] = 44618;
itemdef.originalModelColors[7] = 44618;
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 1;
itemdef.modifiedModelColors[9] = 44603;
itemdef.originalModelColors[9] = 44603;
itemdef.modifiedModelColors[10] = 44570;
itemdef.originalModelColors[10] = 6028;
itemdef.modifiedModelColors[11] = 4500;
itemdef.originalModelColors[11] = 4500;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
if(i == 19955) {
itemdef.name = "Donator Cape";
itemdef.modelID = 13963;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 13962;
itemdef.anInt200 = 13962;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Vestige-x Donator Cape.";
}
if(i == 19954) {
itemdef.name = "Vestige PK Cape";
itemdef.modelID = 53006;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 53006;
itemdef.anInt200 = 53006;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Vestige-x PK Cape.";
}
if(i == 20103) {
		itemdef.modelID = 14418;
		itemdef.name = "Starter Scimitar";
		itemdef.description = "Starter Scimitar.";
		itemdef.modelZoom = 1316;
		itemdef.modelRotation1 = 512;
		itemdef.modelRotation2 = 0;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = -8;
		itemdef.anInt165 = 14418;
		itemdef.anInt200 = 14418;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		} 

		if(i == 4638) {
		itemdef.modelID = 34050;
		itemdef.name = "Ancient Scimitar";
		itemdef.description = "An Ancient Scimitar.";
		itemdef.modelZoom = 1316;
		itemdef.modelRotation1 = 512;
		itemdef.modelRotation2 = 0;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = -8;
		itemdef.anInt165 = 34051;
		itemdef.anInt200 = 34051;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		} 

		if(i == 19956) {
		itemdef.modelID = 12007;
		itemdef.name = "Starting Sword";
		itemdef.description = "Starting Sword.";
		itemdef.modelZoom = 1990;
		itemdef.modelRotation1 = 498;
		itemdef.modelRotation2 = 484;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 12008;
		itemdef.anInt200 = 12008;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[2] = "Check-charges";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 19951) {
itemdef.modelID = 40920;
itemdef.name = "Devil spirit shield";
itemdef.description = "It's a Spectral spirit shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 924;
itemdef.originalModelColors[0] = 44635;
itemdef.modifiedModelColors[1] = 924;
itemdef.originalModelColors[1] = 44612;
itemdef.modifiedModelColors[2] = 924;
itemdef.originalModelColors[2] = 44606;
itemdef.modifiedModelColors[3] = 924;
itemdef.originalModelColors[3] = 44615;
itemdef.modifiedModelColors[4] = 924;
itemdef.originalModelColors[4] = 44641;
itemdef.modifiedModelColors[5] = 924;
itemdef.originalModelColors[5] = 44564;
itemdef.modifiedModelColors[6] = 924;
itemdef.originalModelColors[6] = 44575; 
itemdef.modifiedModelColors[7] = 924;
itemdef.originalModelColors[7] = 44618; 
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 105;
itemdef.modifiedModelColors[9] = 924;
itemdef.originalModelColors[9] = 44603;
itemdef.modifiedModelColors[10] = 924;
itemdef.originalModelColors[10] = 44570; 
itemdef.modifiedModelColors[11] = 924;
itemdef.originalModelColors[11] = 4500;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
if(i == 20126) {
itemdef.modelID = 40920;
itemdef.name = "Devil spirit shield (d)";
itemdef.description = "It's a Spectral spirit shield";
itemdef.modifiedModelColors = new int[13];
itemdef.originalModelColors = new int[13];
itemdef.modifiedModelColors[0] = 924;
itemdef.originalModelColors[0] = 44635;
itemdef.modifiedModelColors[1] = 924;
itemdef.originalModelColors[1] = 44612;
itemdef.modifiedModelColors[2] = 924;
itemdef.originalModelColors[2] = 44606;
itemdef.modifiedModelColors[3] = 924;
itemdef.originalModelColors[3] = 44615;
itemdef.modifiedModelColors[4] = 924;
itemdef.originalModelColors[4] = 44641;
itemdef.modifiedModelColors[5] = 924;
itemdef.originalModelColors[5] = 44564;
itemdef.modifiedModelColors[6] = 924;
itemdef.originalModelColors[6] = 44575; 
itemdef.modifiedModelColors[7] = 924;
itemdef.originalModelColors[7] = 44618; 
itemdef.modifiedModelColors[8] = 105;
itemdef.originalModelColors[8] = 105;
itemdef.modifiedModelColors[9] = 924;
itemdef.originalModelColors[9] = 44603;
itemdef.modifiedModelColors[10] = 924;
itemdef.originalModelColors[10] = 44570; 
itemdef.modifiedModelColors[11] = 924;
itemdef.originalModelColors[11] = 4500;
itemdef.modelZoom = 1616;
itemdef.modelRotation1 = 396;
itemdef.modelRotation2 = 1050;
itemdef.modelOffset2 = -3;
itemdef.modelOffset1 = 4;
itemdef.anInt165 = 40940;
itemdef.anInt200 = 40940;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}

if(i == 1163) {
	itemdef.name = "Rune full helm";
	itemdef.description = "It's a Rune full helm";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67387;
	itemdef.anInt165 = 66462;
	itemdef.anInt200 = 66848;
	itemdef.modelZoom = 658;
	itemdef.modelRotation2 = 67;
	itemdef.modelRotation1 = 94;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 0;
}
if(i == 1201){
	itemdef.name = "Rune kiteshield";
	itemdef.description = "It's a Rune kiteshield";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67568;
	itemdef.anInt165 = 67854;
	itemdef.anInt200 = 67830;
	itemdef.modelZoom = 1872;
	itemdef.modelRotation2 = 512;
	itemdef.modelRotation1 = 162;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 3;
}
	
if(i == 1123){
	itemdef.name = "Adamant platebody";
	itemdef.description = "It's a Adamant platebody";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67100;
	itemdef.anInt165 = 66613;
	itemdef.anInt200 = 66999;
	itemdef.modelZoom = 1230;
	itemdef.modelRotation2 = 595;
	itemdef.modelRotation1 = 2039;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = -3;

}	
	
	if(i == 1073){
	itemdef.name = "Adamant platelegs";
	itemdef.description = "It's a Adamant platelegs";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67124;
	itemdef.anInt165 = 66499;
	itemdef.anInt200 = 66878;
	itemdef.modelZoom = 1561;
	itemdef.modelRotation2 = 321;
	itemdef.modelRotation1 = 256;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 7;
}
	
if(i == 1161){
	itemdef.name = "Adamant full helm";
	itemdef.description = "It's a Adamant full helm";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67104;
	itemdef.anInt165 = 66400;
	itemdef.anInt200 = 66776;
	itemdef.modelZoom = 658;
	itemdef.modelRotation2 = 54;
	itemdef.modelRotation1 = 121;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = -1;

}
	
if(i == 1199){
	itemdef.name = "Adamant kiteshield";
	itemdef.description = "It's a Adamant kiteshield";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67529;
	itemdef.anInt165 = 67779;
	itemdef.anInt200 = 67776;
	itemdef.modelZoom = 1776;
	itemdef.modelRotation2 = 404;
	itemdef.modelRotation1 = 189;
	itemdef.modelOffset1 = 5;
	itemdef.modelOffset2 = 9;
}	
if(i == 1121){
	itemdef.name = "Mithril platebody";
	itemdef.description = "It's a Mithril platebody";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67327;
	itemdef.anInt165 = 66658;
	itemdef.anInt200 = 67049;
	itemdef.modelZoom = 1776;
	itemdef.modelRotation2 = 485;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 3;
	itemdef.modelOffset2 = 1;
}
	
if(i == 1071){
	itemdef.name = "Mithril platelegs";
	itemdef.description = "It's a Mithril platelegs";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67337;
	itemdef.anInt165 = 66557;
	itemdef.anInt200 = 66947;
	itemdef.modelZoom = 1842;
	itemdef.modelRotation2 = 485;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 0;
}

if(i == 1159){
	itemdef.name = "Mithril full helm";
	itemdef.description = "It's a Mithril full helm";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67338;
	itemdef.anInt165 = 66444;
	itemdef.anInt200 = 66826;
	itemdef.modelZoom = 658;
	itemdef.modelRotation2 = 67;
	itemdef.modelRotation1 = 94;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 7258;
}

if(i == 1197){
	itemdef.name = "Mithril kiteshield";
	itemdef.description = "It's a Mithril kiteshield";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67557;
	itemdef.anInt165 = 67818;
	itemdef.anInt200 = 67818;
	itemdef.modelZoom = 1579;
	itemdef.modelRotation2 = 337;
	itemdef.modelRotation1 = 242;
	itemdef.modelOffset1 = 11;
	itemdef.modelOffset2 = 11;
}

if(i == 1125){
	itemdef.name = "Black platebody";
	itemdef.description = "It's a Black platebody";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67158;
	itemdef.anInt165 = 66624;
	itemdef.anInt200 = 67013;
	itemdef.modelZoom = 1614;
	itemdef.modelRotation2 = 559;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 3;
	itemdef.modelOffset2 = -1;
	itemdef.value = 3840;
	itemdef.membersObject = false;
}

if(i == 1077){
	itemdef.name = "Black platelegs";
	itemdef.description = "It's a Black platelegs";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67195;
	itemdef.anInt165 = 66511;
	itemdef.anInt200 = 66907;
	itemdef.modelZoom = 1433;
	itemdef.modelRotation2 = 321;
	itemdef.modelRotation1 = 225;
	itemdef.modelOffset1 = -1;
	itemdef.modelOffset2 = 7;
	itemdef.value = 1920;
	itemdef.membersObject = false;
}

if(i == 1165){
	itemdef.name = "Black full helm";
	itemdef.description = "It's a Black full helm";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67156;
	itemdef.anInt165 = 66409;
	itemdef.anInt200 = 66790;
	itemdef.modelZoom = 917;
	itemdef.modelRotation2 = 296;
	itemdef.modelRotation1 = 2028;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 18;
	itemdef.value = 1372;
	itemdef.membersObject = false;
}

if(i == 1195){
	itemdef.name = "Black kiteshield";
	itemdef.description = "It's a Black kiteshield";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.modelID = 67541;
	itemdef.anInt165 = 67806;
	itemdef.anInt200 = 67799;
	itemdef.modelZoom = 1650;
	itemdef.modelRotation2 = 337;
	itemdef.modelRotation1 = 215;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 5;
	itemdef.value = 2121;
	itemdef.membersObject = false;
}

     if(i == 13495)
     {
           itemdef.modelID = 8372;
           itemdef.name = "Master Corruption";
           itemdef.description = "Attunes your soul to the powers of darkness";
           itemdef.modelZoom = 2105;
           itemdef.modelRotation1 = 474;
           itemdef.stackable = false;
           itemdef.modelRotation2 = 2042;
           itemdef.modelOffset1 = 1;
           itemdef.modelOffset2 = 4;
           itemdef.anInt165 = 70001;
           itemdef.anInt200 = 70002;
           itemdef.groundActions = new String[5];
           itemdef.groundActions[2] = "Take";
           itemdef.itemActions = new String[5];
           itemdef.itemActions[1] = "Activate";
           itemdef.itemActions[2] = "Time-Remaining";
           itemdef.itemActions[4] = "Destroy";
        }
        if(i == 13492)
        {
           itemdef.modelID = 8372;
           itemdef.name = "Master Salvation";
           itemdef.description = "Attunes your soul to the powers of Light";
           itemdef.modelZoom = 2105;
           itemdef.modelRotation1 = 474;
           itemdef.stackable = false;
           itemdef.modelRotation2 = 2042;
           itemdef.modelOffset1 = 1;
           itemdef.modelOffset2 = 4;
           itemdef.anInt165 = 70004;
           itemdef.anInt200 = 70005;
           itemdef.groundActions = new String[5];
           itemdef.groundActions[2] = "Take";
           itemdef.itemActions = new String[5];
           itemdef.itemActions[1] = "Activate";
           itemdef.itemActions[2] = "Time-Remaining";
           itemdef.itemActions[4] = "Destroy";
        }
        if(i == 13493)
        {
           itemdef.modelID = 8372;
           itemdef.name = "Supreme salvation";
           itemdef.description = "Attunes your soul to the powers of darkness";
           itemdef.modelZoom = 2105;
           itemdef.modelRotation1 = 474;
           itemdef.stackable = false;
           itemdef.modelRotation2 = 2042;
           itemdef.modelOffset1 = 1;
           itemdef.modelOffset2 = 4;
           itemdef.anInt165 = 68611;
           itemdef.anInt200 = 68608;
           itemdef.groundActions = new String[5];
           itemdef.groundActions[2] = "Take";
           itemdef.itemActions = new String[5];
           itemdef.itemActions[1] = "Activate";
           itemdef.itemActions[2] = "Time-Remaining";
           itemdef.itemActions[4] = "Destroy";
        }
        if(i == 17935)
        {
            itemdef.modelID = 65256;
            itemdef.name = "Milestone cape 10";
            itemdef.description = "A cape worn by those who've achieved at least level 10 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65294;
            itemdef.anInt200 = 65315;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 4639) {
            itemdef.modelID = 37768;
            itemdef.name = "Red Sexy Cape";
            itemdef.description = "A cape worn by those who are sexy enough.";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 37767;
            itemdef.anInt200 = 37767;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 4641) {
            itemdef.modelID = 45656;
            itemdef.name = "Flaming Cape";
            itemdef.description = "It's on fire.";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 45656;
            itemdef.anInt200 = 45656;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 18743)
        {
            itemdef.modelID = 3288;
            itemdef.name = "Death Cape";
            itemdef.description = "A cape worn by the loyal players of Vestige-x.";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 3287;
            itemdef.anInt200 = 3287;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 11137)
        {
            itemdef.name = "Lvl 99 Lamp";
            itemdef.description = "Raises any skill of your choise to 99 instantly.";
        }
        if(i == 18651)
        {
            itemdef.name = "Tzhrek-Jad";
            itemdef.description = "Tzhrek-Jad The son of the mighty boss JAD!";
        }
        if(i == 17937)
        {
            itemdef.modelID = 65266;
            itemdef.name = "Milestone cape 20";
            itemdef.description = "A cape worn by those who've achieved at least level 20 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65298;
            itemdef.anInt200 = 65317;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17939)
        {
            itemdef.modelID = 65272;
            itemdef.name = "Milestone cape 30";
            itemdef.description = "A cape worn by those who've achieved at least level 30 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65306;
            itemdef.anInt200 = 65323;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17941)
        {
            itemdef.modelID = 65260;
            itemdef.name = "Milestone cape 40";
            itemdef.description = "A cape worn by those who've achieved at least level 40 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65296;
            itemdef.anInt200 = 65321;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17943)
        {
            itemdef.modelID = 65263;
            itemdef.name = "Milestone cape 50";
            itemdef.description = "A cape worn by those who've achieved at least level 50 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65301;
            itemdef.anInt200 = 65324;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17945)
        {
            itemdef.modelID = 65259;
            itemdef.name = "Milestone cape 60";
            itemdef.description = "A cape worn by those who've achieved at least level 60 in all skills";
            itemdef.modelZoom = 1385;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65304;
            itemdef.anInt200 = 65319;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17947)
        {
            itemdef.modelID = 65267;
            itemdef.name = "Milestone cape 70";
            itemdef.description = "A cape worn by those who've achieved at least level 70 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65299;
            itemdef.anInt200 = 65326;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17949)
        {
            itemdef.modelID = 65264;
            itemdef.name = "Milestone cape 80";
            itemdef.description = "A cape worn by those who've achieved at least level 80 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65303;
            itemdef.anInt200 = 65320;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 17951)
        {
            itemdef.modelID = 65265;
            itemdef.name = "Milestone cape 90";
            itemdef.description = "A cape worn by those who've achieved at least level 90 in all skills";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65293;
            itemdef.anInt200 = 65325;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19138)
        {
            itemdef.modelID = 65258;
            itemdef.name = "Completionist cape";
            itemdef.description = " We'd pat you on the back, but this cape would get in the way.";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 024;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65295;
            itemdef.anInt200 = 65328;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19139)
        {
            itemdef.modelID = 65269;
            itemdef.name = "Completionist hood";
            itemdef.description = "A hood worn by those who've over achieved.";
            itemdef.modelZoom = 980;
            itemdef.modelRotation1 = 208;
            itemdef.modelRotation2 = 220;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -18;
            itemdef.anInt165 = 65288;
            itemdef.anInt200 = 65312;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19140)
        {
            itemdef.modelID = 65270;
            itemdef.name = "Completionist cape";
            itemdef.description = "A cape worn by those who've over achieved. ";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65297;
            itemdef.anInt200 = 65316;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19141)
        {
            itemdef.modelID = 65273;
            itemdef.name = "Completionist hood";
            itemdef.description = "A hood worn by those who've over achieved.";
            itemdef.modelZoom = 980;
            itemdef.modelRotation1 = 208;
            itemdef.modelRotation2 = 220;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -18;
            itemdef.anInt165 = 65292;
            itemdef.anInt200 = 65310;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19142)
        {
            itemdef.modelID = 65262;
            itemdef.name = "Max cape";
            itemdef.description = "A cape worn by those who've achieved 99 in all skills.";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65300;
            itemdef.anInt200 = 65322;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19954)
        {
            itemdef.modelID = 65268;
            itemdef.name = "Max hood";
            itemdef.description = "A hood worn by those who've achieved 99 in all skills.";
            itemdef.modelZoom = 980;
            itemdef.modelRotation1 = 208;
            itemdef.modelRotation2 = 220;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -18;
            itemdef.anInt165 = 65291;
            itemdef.anInt200 = 65313;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19956)
        {
            itemdef.modelID = 65271;
            itemdef.name = "Veteran hood";
            itemdef.description = "A hood worn by veterans.";
            itemdef.modelZoom = 980;
            itemdef.modelRotation1 = 208;
            itemdef.modelRotation2 = 220;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -18;
            itemdef.anInt165 = 65289;
            itemdef.anInt200 = 65314;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19957)
        {
            itemdef.modelID = 65257;
            itemdef.name = "Classic cape";
            itemdef.description = "A cape worn by those who've seen the world in a different light.";
            itemdef.modelZoom = 1579;
            itemdef.modelOffset1 = -4;
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation1 = 333;
            itemdef.anInt165 = 65302;
            itemdef.anInt200 = 65327;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 15117)
        {
            itemdef.modelID = 65261;
            itemdef.name = "Veteran cape";
            itemdef.modelZoom = 1513;
            itemdef.modelRotation1 = 279;
            itemdef.modelRotation2 = 948;
            itemdef.modelOffset1 = -3;
            itemdef.modelOffset2 = 24;
            itemdef.stackable = false;
            itemdef.value = 50000;
            itemdef.membersObject = true;
            itemdef.anInt165 = 65305;
            itemdef.anInt200 = 65318;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if (i == 4804)
        {
             itemdef.modelID = 8372;
             itemdef.name = "Sharpshooter";
             itemdef.description = "Increases your Range Damage by 22% for 1 hour. DOES NOT WORK IN PvP!";
             itemdef.modelZoom = 2105;
             itemdef.modelRotation1 = 474;
             itemdef.stackable = false;
             itemdef.modelRotation2 = 2042;
             itemdef.modelOffset1 = 1;
             itemdef.modelOffset2 = 4;
             itemdef.anInt165 = 8396;
             itemdef.anInt200 = 8396;
             itemdef.value = 400000;
             itemdef.groundActions = new String[5];
             itemdef.groundActions[2] = "Take";
             itemdef.itemActions = new String[5];
             itemdef.itemActions[1] = "Activate";
             itemdef.itemActions[2] = "Time-Remaining";
             itemdef.itemActions[4] = "Destroy";
        }
        if (i == 4805)
        {
             itemdef.modelID = 8372;
             itemdef.name = "Asura";
             itemdef.description = "Increases your Melee Damage by 22% for 1 hour. DOES NOT WORK IN PvP!";
             itemdef.modelZoom = 2105;
             itemdef.modelRotation1 = 474;
             itemdef.stackable = false;
             itemdef.modelRotation2 = 2042;
             itemdef.modelOffset1 = 1;
             itemdef.modelOffset2 = 4;
             itemdef.anInt165 = 8396;
             itemdef.anInt200 = 8396;
             itemdef.value = 400000;
             itemdef.groundActions = new String[5];
             itemdef.groundActions[2] = "Take";
             itemdef.itemActions = new String[5];
             itemdef.itemActions[1] = "Activate";
             itemdef.itemActions[2] = "Time-Remaining";
             itemdef.itemActions[4] = "Destroy";
        }
        if (i == 4806)
        {
             itemdef.modelID = 8372;
             itemdef.name = "Serac";
             itemdef.description = "Raises your Magic accuracy by 7% for 1 hour. DOES NOT WORK IN PvP!";
             itemdef.modelZoom = 2105;
             itemdef.modelRotation1 = 474;
             itemdef.stackable = false;
             itemdef.modelRotation2 = 2042;
             itemdef.modelOffset1 = 1;
             itemdef.modelOffset2 = 4;
             itemdef.anInt165 = 8396;
             itemdef.anInt200 = 8396;
             itemdef.value = 400000;
             itemdef.groundActions = new String[5];
             itemdef.groundActions[2] = "Take";
             itemdef.itemActions = new String[5];
             itemdef.itemActions[1] = "Activate";
             itemdef.itemActions[2] = "Time-Remaining";
             itemdef.itemActions[4] = "Destroy";
        }
        if(i == 19111)
        {
            itemdef.name = "TokHaar-Kal";
            ItemDef _tmp = itemdef;
            itemdef.value = 60000;
            itemdef.anInt165 = 62575;
            itemdef.anInt200 = 62582;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.modelOffset1 = -4;
            itemdef.modelID = 62592;
            itemdef.stackable = false;
            itemdef.description = "A cape made of ancient, enchanted obsidian.";
            itemdef.modelZoom = 2086;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
            itemdef.modelOffset2 = 0;
            itemdef.modelRotation1 = 533;
            itemdef.modelRotation2 = 333;
        }
        if (i == 11613)
        {
            itemdef.name = "Dragon kiteshield";
            itemdef.modelZoom = 1378;
            itemdef.modelRotation1 = 264;
            itemdef.modelRotation2 = 1913;
            itemdef.modelOffset1 = 7;
            itemdef.modelOffset2 = 58;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.modelID = 70128;
            itemdef.anInt165 = 70672;
            itemdef.anInt200 = 70672;
        }
        if(i == 13221)
        {
            itemdef.modelID = 4421;
            itemdef.name = "Diamond Pickaxe";
            itemdef.description = (new StringBuilder()).append("It's a ").append(itemdef.name).toString();
            itemdef.stackable = false;
            itemdef.modelZoom = 1755;
            itemdef.modelRotation1 = 431;
            itemdef.modelRotation2 = 545;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 4422;
            itemdef.anInt200 = 4422;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Craft";
        }
        if(i == 13225)
        {
            itemdef.modelID = 4423;
            itemdef.name = "MineCraft Helm";
            itemdef.description = "MineCraft Helmet";
            itemdef.modelZoom = 980;
            itemdef.modelRotation1 = 208;
            itemdef.modelRotation2 = 220;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -18;
            itemdef.anInt165 = 4424;
            itemdef.anInt200 = 4424;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 19478)
        {
            itemdef.modelID = 3832;
            itemdef.name = "Dominion sword";
            itemdef.description = (new StringBuilder()).append("It's a ").append(itemdef.name).toString();
            itemdef.stackable = false;
            itemdef.modelZoom = 1755;
            itemdef.modelRotation1 = 431;
            itemdef.modelRotation2 = 545;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 2306;
            itemdef.anInt200 = 2306;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Destroy";
        }
        if(i == 19477)
        {
            itemdef.modelID = 3839;
            itemdef.name = "Dominion crossbow";
            itemdef.description = (new StringBuilder()).append("It's a ").append(itemdef.name).toString();
            itemdef.stackable = false;
            itemdef.modelZoom = 1480;
            itemdef.modelRotation1 = 346;
            itemdef.modelRotation2 = 801;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 2304;
            itemdef.anInt200 = 2304;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Destroy";
        }
        if(i == 4640)
        {
            itemdef.modelID = 43978;
            itemdef.name = "Icy Bow";
            itemdef.description = (new StringBuilder()).append("It's an ").append(itemdef.name).toString();
            itemdef.stackable = false;
            itemdef.modelZoom = 1480;
            itemdef.modelRotation1 = 346;
            itemdef.modelRotation2 = 801;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 43977;
            itemdef.anInt200 = 43977;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Destroy";
        }

        if(i == 19476)
        {
            itemdef.modelID = 13426;
            itemdef.name = "Polypore Staff";
            itemdef.description = "It's a Polypore Staff.";
            itemdef.stackable = false;
            itemdef.modelZoom = 3602;
            itemdef.modelRotation1 = 657;
            itemdef.modelRotation2 = 2029;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 13417;
            itemdef.anInt200 = 13417;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Destroy";
        }
        if(i == 15488)
        {
            itemdef.name = "Staff of light";
            itemdef.modelID = 51845;
            itemdef.modifiedModelColors = new int [11];
            itemdef.originalModelColors = new int [11];
            itemdef.modifiedModelColors[0] = 7860;
            itemdef.originalModelColors[0] = 432;
            itemdef.modifiedModelColors[1] = 7876;
            itemdef.originalModelColors[1] = 432;
            itemdef.modifiedModelColors[2] = 7892;
            itemdef.originalModelColors[2] = 432;
            itemdef.modifiedModelColors[3] = 7884;
            itemdef.originalModelColors[3] = 432;
            itemdef.modifiedModelColors[4] = 7868;
            itemdef.originalModelColors[4] = 432;
            itemdef.modifiedModelColors[5] = 7864;
            itemdef.originalModelColors[5] = 432;
            itemdef.modifiedModelColors[6] = 7880;
            itemdef.originalModelColors[6] = 432;
            itemdef.modifiedModelColors[7] = 7848;
            itemdef.originalModelColors[7] = 432;
            itemdef.modifiedModelColors[8] = 7888;
            itemdef.originalModelColors[8] = 432;
            itemdef.modifiedModelColors[9] = 7872;
            itemdef.originalModelColors[9] = 432;
            itemdef.modifiedModelColors[10] = 7856;
            itemdef.originalModelColors[10] = 432;
            itemdef.modelZoom = 2256;
            itemdef.modelRotation1 = 456;
            itemdef.modelRotation2 = 513;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 51795;
            itemdef.anInt200 = 51795;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wield";
        }
        if(i == 13822)
        {
            itemdef.name = "Staff of light";
            itemdef.modelID = 51845;
            itemdef.modifiedModelColors = new int [11];
            itemdef.originalModelColors = new int [11];
            itemdef.modifiedModelColors[0] = 7860;
            itemdef.originalModelColors[0] = 38310;
            itemdef.modifiedModelColors[1] = 7876;
            itemdef.originalModelColors[1] = 38310;
            itemdef.modifiedModelColors[2] = 7892;
            itemdef.originalModelColors[2] = 38310; 
            itemdef.modifiedModelColors[3] = 7884;
            itemdef.originalModelColors[3] = 38310;
            itemdef.modifiedModelColors[4] = 7868;
            itemdef.originalModelColors[4] = 38310;
            itemdef.modifiedModelColors[5] = 7864;
            itemdef.originalModelColors[5] = 38310;
            itemdef.modifiedModelColors[6] = 7880;
            itemdef.originalModelColors[6] = 38310;
            itemdef.modifiedModelColors[7] = 7848;
            itemdef.originalModelColors[7] = 38310;
            itemdef.modifiedModelColors[8] = 7888;
            itemdef.originalModelColors[8] = 38310;
            itemdef.modifiedModelColors[9] = 7872;
            itemdef.originalModelColors[9] = 38310; 
            itemdef.modifiedModelColors[10] = 7856;   
            itemdef.originalModelColors[10] = 432;
            itemdef.modelZoom = 2256;
            itemdef.modelRotation1 = 456;
            itemdef.modelRotation2 = 513;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 51795;
            itemdef.anInt200 = 51795;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wield";
        }
        if(i == 13824)
        {
            itemdef.name = "Robin hood hat";
            itemdef.modelID = 3021;
            itemdef.modifiedModelColors = new int [3];
            itemdef.originalModelColors = new int [3];
            itemdef.modifiedModelColors[0] = 15252;
            itemdef.originalModelColors[0] = 3988;
            itemdef.modifiedModelColors[1] = 17294;
            itemdef.originalModelColors[1] = 3982;
            itemdef.modifiedModelColors[2] = 15009;
            itemdef.originalModelColors[2] = 3745;
            itemdef.modelZoom = 650; 
            itemdef.modelRotation1 = 2044;
            itemdef.modelRotation2 = 256;
            itemdef.modelOffset1 = -3;
            itemdef.modelOffset2 = -2;
            itemdef.anInt165 = 3378;
            itemdef.anInt200 = 3382;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13832)
        {
            itemdef.name = "Ragefire boots";
            itemdef.modelID = 53897;
            itemdef.modelZoom = 900;
            itemdef.modelRotation1 = 165;
            itemdef.modelRotation2 = 99;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 =-7;
            itemdef.anInt165 = 53330;
            itemdef.anInt200 = 53330;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.description = "Some Ragefire boots.";
        }
        if(i == 13834)
        {
            itemdef.name = "Steadfast boots";
            itemdef.modelID = 53835;
            itemdef.modelZoom = 900;
            itemdef.modelRotation1 = 165;
            itemdef.modelRotation2 = 99;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 =-7;
            itemdef.anInt165 = 53327;
            itemdef.anInt200 = 53327;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.description = "Some Steadfast boots.";
        }
        if(i == 13836)
        {
            itemdef.name = "Glaiven boots";
            itemdef.modelID = 53828;
            itemdef.modelZoom = 900;
            itemdef.modelRotation1 = 165;
            itemdef.modelRotation2 = 99;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 =-7;
            itemdef.anInt165 = 53309;
            itemdef.anInt200 = 53309;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.description = "Some Glaiven boots.";
        }
        if(i == 13826)
        {
            itemdef.name = "Robin hood hat";
            itemdef.modelID = 3021;
            itemdef.modifiedModelColors = new int [3];
            itemdef.originalModelColors = new int [3];
            itemdef.modifiedModelColors[0] = 15252;
            itemdef.originalModelColors[0] = 7973;
            itemdef.modifiedModelColors[1] = 17294;
            itemdef.originalModelColors[1] = 7730;
            itemdef.modifiedModelColors[2] = 15009;
            itemdef.originalModelColors[2] = 10015;
            itemdef.modelZoom = 650; 
            itemdef.modelRotation1 = 2044;
            itemdef.modelRotation2 = 256;
            itemdef.modelOffset1 = -3;
            itemdef.modelOffset2 = -2;
            itemdef.anInt165 = 3378;
            itemdef.anInt200 = 3382;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13828)
        {
            itemdef.name = "Robin hood hat";
            itemdef.modelID = 3021;
            itemdef.modifiedModelColors = new int [3];
            itemdef.originalModelColors = new int [3];
            itemdef.modifiedModelColors[0] = 15252;
            itemdef.originalModelColors[0] = 35732;
            itemdef.modifiedModelColors[1] = 17294;
            itemdef.originalModelColors[1] = 37774;
            itemdef.modifiedModelColors[2] = 15009;
            itemdef.originalModelColors[2] = 35489;
            itemdef.modelZoom = 650; 
            itemdef.modelRotation1 = 2044;
            itemdef.modelRotation2 = 256;
            itemdef.modelOffset1 = -3;
            itemdef.modelOffset2 = -2;
            itemdef.anInt165 = 3378;
            itemdef.anInt200 = 3382;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13830)
        {
            itemdef.name = "Robin hood hat";
            itemdef.modelID = 3021;
            itemdef.modifiedModelColors = new int [3];
            itemdef.originalModelColors = new int [3];
            itemdef.modifiedModelColors[0] = 15252;
            itemdef.originalModelColors[0] = 30847;
            itemdef.modifiedModelColors[1] = 17294;
            itemdef.originalModelColors[1] = 32895;
            itemdef.modifiedModelColors[2] = 15009;
            itemdef.originalModelColors[2] = 30847;
            itemdef.modelZoom = 650; 
            itemdef.modelRotation1 = 2044;
            itemdef.modelRotation2 = 256;
            itemdef.modelOffset1 = -3;
            itemdef.modelOffset2 = -2;
            itemdef.anInt165 = 3378;
            itemdef.anInt200 = 3382;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13484)
        {
            itemdef.name = "Staff of light";
            itemdef.modelID = 51845;
            itemdef.modifiedModelColors[0] = 7860;
            itemdef.modifiedModelColors = new int [11];
            itemdef.originalModelColors = new int [11];
            itemdef.modifiedModelColors[0] = 7860;
            itemdef.originalModelColors[0] = 24006;
            itemdef.modifiedModelColors[1] = 7876;
            itemdef.originalModelColors[1] = 24006;
            itemdef.modifiedModelColors[2] = 7892;
            itemdef.originalModelColors[2] = 24006;
            itemdef.modifiedModelColors[3] = 7884;
            itemdef.originalModelColors[3] = 24006;
            itemdef.modifiedModelColors[4] = 7868;
            itemdef.originalModelColors[4] = 24006;
            itemdef.modifiedModelColors[5] = 7864;
            itemdef.originalModelColors[5] = 24006;
            itemdef.modifiedModelColors[6] = 7880;
            itemdef.originalModelColors[6] = 24006;
            itemdef.modifiedModelColors[7] = 7848;
            itemdef.originalModelColors[7] = 24006;
            itemdef.modifiedModelColors[8] = 7888;
            itemdef.originalModelColors[8] = 24006;
            itemdef.modifiedModelColors[9] = 7872;
            itemdef.originalModelColors[9] = 24006;
            itemdef.modifiedModelColors[10] = 7856;
            itemdef.originalModelColors[10] = 24006;
            itemdef.modelZoom = 2256;
            itemdef.modelRotation1 = 456;
            itemdef.modelRotation2 = 513;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 51795;
            itemdef.anInt200 = 51795;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wield";
        }
        if(i == 13482)
        {
            itemdef.name = "Staff of light";
            itemdef.modelID = 51845;
            itemdef.modifiedModelColors[0] = 7860;
            itemdef.modifiedModelColors = new int [11];
            itemdef.originalModelColors = new int [11];
            itemdef.modifiedModelColors[0] = 7860;
            itemdef.originalModelColors[0] = 14285;
            itemdef.modifiedModelColors[1] = 7876;
            itemdef.originalModelColors[1] = 14285;
            itemdef.modifiedModelColors[2] = 7892;
            itemdef.originalModelColors[2] = 14285;
            itemdef.modifiedModelColors[3] = 7884;
            itemdef.originalModelColors[3] = 14285;
            itemdef.modifiedModelColors[4] = 7868;
            itemdef.originalModelColors[4] = 14285;
            itemdef.modifiedModelColors[5] = 7864;
            itemdef.originalModelColors[5] = 14285;
            itemdef.modifiedModelColors[6] = 7880;
            itemdef.originalModelColors[6] = 14285;
            itemdef.modifiedModelColors[7] = 7848;
            itemdef.originalModelColors[7] = 14285;
            itemdef.modifiedModelColors[8] = 7888;
            itemdef.originalModelColors[8] = 14285;
            itemdef.modifiedModelColors[9] = 7872;
            itemdef.originalModelColors[9] = 14285;
            itemdef.modifiedModelColors[10] = 7856;
            itemdef.originalModelColors[10] = 14285;
            itemdef.modelZoom = 2256;
            itemdef.modelRotation1 = 456;
            itemdef.modelRotation2 = 513;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 51795;
            itemdef.anInt200 = 51795;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wield";
        }
        if(i == 19475)
        {
            itemdef.modelID = 13436;
            itemdef.name = "Polypore Staff";
            itemdef.description = "It's a Polypore Staff.";
            itemdef.stackable = false;
            itemdef.modelZoom = 3602;
            itemdef.modelRotation1 = 660;
            itemdef.modelRotation2 = 2029;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 13416;
            itemdef.anInt200 = 13416;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Destroy";
        }
        if(i == 13997)
        {
            itemdef.name = "Trickster robe";
            itemdef.description = "Its a Trickster robe";
            itemdef.anInt165 = 44786;
            itemdef.anInt200 = 44786;
            itemdef.modelID = 45329;
            itemdef.modelRotation1 = 593;
            itemdef.modelRotation2 = 2041;
            itemdef.modelZoom = 1420;
            itemdef.modelOffset2 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13997)
        {
            itemdef.name = "Trickster robe";
            itemdef.description = "Its a Trickster robe";
            itemdef.anInt165 = 44786;
            itemdef.anInt200 = 44786;
            itemdef.modelID = 45329;
            itemdef.modelRotation1 = 593;
            itemdef.modelRotation2 = 2041;
            itemdef.modelZoom = 1420;
            itemdef.modelOffset2 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13998)
        {
            itemdef.name = "Trickster robe legs";
            itemdef.description = "Its a Trickster robe";
            itemdef.anInt165 = 44770;
            itemdef.anInt200 = 44770;
            itemdef.modelID = 45335;
            itemdef.modelRotation1 = 567;
            itemdef.modelRotation2 = 1023;
            itemdef.modelZoom = 2105;
            itemdef.modelOffset2 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 13999)
        {
            itemdef.name = "Trickster helm";
            itemdef.description = "Its a Trickster helm";
            itemdef.anInt165 = 44764;
            itemdef.anInt200 = 44764;
            itemdef.modelID = 45328;
            itemdef.modelRotation1 = 5;
            itemdef.modelRotation2 = 1889;
            itemdef.modelZoom = 738;
            itemdef.modelOffset2 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
        }
        if(i == 14000)
        {
            itemdef.modelID = 44633;
            itemdef.name = "Vanguard helm";
            itemdef.modelZoom = 855;
            itemdef.modelRotation1 = 1966;
            itemdef.modelRotation2 = 5;
            itemdef.modelOffset2 = 4;
            itemdef.modelOffset1 = -1;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44769;
            itemdef.anInt200 = 44769;
        }
        if(i == 14001)
        {
            itemdef.modelID = 44627;
            itemdef.name = "Vanguard body";
            itemdef.modelZoom = 1513;
            itemdef.modelRotation2 = 2041;
            itemdef.modelRotation1 = 593;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 = -11;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44812;
            itemdef.anInt200 = 44812;
        }
        if(i == 14002)
        {
            itemdef.modelID = 44658;
            itemdef.name = "Vanguard legs";
            itemdef.modelZoom = 1711;
            itemdef.modelRotation2 = 0;
            itemdef.modelRotation1 = 360;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 = -11;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44771;
            itemdef.anInt200 = 44771;
        }
        if(i == 20145)
        {
            itemdef.modelID = 44633;
            itemdef.name = "Vanguard helm (d)";
            itemdef.modelZoom = 855;
            itemdef.modelRotation1 = 1966;
            itemdef.modelRotation2 = 5;
            itemdef.modelOffset2 = 4;
            itemdef.modelOffset1 = -1;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44769;
            itemdef.anInt200 = 44769;
        }
        if(i == 20146)
        {
            itemdef.modelID = 44627;
            itemdef.name = "Vanguard body (d)";
            itemdef.modelZoom = 1513;
            itemdef.modelRotation2 = 2041;
            itemdef.modelRotation1 = 593;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 = -11;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44812;
            itemdef.anInt200 = 44812;
        }
        if(i == 20147)
        {
            itemdef.modelID = 44658;
            itemdef.name = "Vanguard legs (d)";
            itemdef.modelZoom = 1711;
            itemdef.modelRotation2 = 0;
            itemdef.modelRotation1 = 360;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 = -11;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44771;
            itemdef.anInt200 = 44771;
        }
        if(i == 14003)
        {
            itemdef.modelID = 44704;
            itemdef.name = "Battle-mage helm";
            itemdef.modelZoom = 658;
            itemdef.modelRotation2 = 1898;
            itemdef.modelRotation1 = 2;
            itemdef.modelOffset1 = 12;
            itemdef.modelOffset2 = 3;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44767;
            itemdef.anInt200 = 44767;
        }
        if(i == 14004)
        {
            itemdef.modelID = 44631;
            itemdef.name = "Battle-mage robe";
            itemdef.modelZoom = 1382;
            itemdef.modelRotation2 = 3;
            itemdef.modelRotation1 = 488;
            itemdef.modelOffset1 = 1;
            itemdef.modelOffset2 = 0;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44818;
            itemdef.anInt200 = 44818;
        }
        if(i == 14005)
        {
            itemdef.modelID = 44672;
            itemdef.name = "Battle-mage robe legs";
            itemdef.modelZoom = 1842;
            itemdef.modelRotation2 = 1024;
            itemdef.modelRotation1 = 498;
            itemdef.modelOffset1 = 4;
            itemdef.modelOffset2 = -1;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44775;
            itemdef.anInt200 = 44775;
        }
        if(i == 14006)
        {
            itemdef.modelID = 45316;
            itemdef.name = "Trickster boots";
            itemdef.modelZoom = 848;
            itemdef.modelRotation2 = 141;
            itemdef.modelRotation1 = 141;
            itemdef.modelOffset1 = -9;
            itemdef.modelOffset2 = 0;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44757;
            itemdef.anInt200 = 44757;
        }
        if(i == 14007)
        {
            itemdef.modelID = 45317;
            itemdef.name = "Trickster gloves";
            itemdef.modelZoom = 830;
            itemdef.modelRotation2 = 150;
            itemdef.modelRotation1 = 536;
            itemdef.modelOffset1 = 1;
            itemdef.modelOffset2 = 3;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44761;
            itemdef.anInt200 = 44761;
        }
        if(i == 14008)
        {
            itemdef.modelID = 44662;
            itemdef.name = "Battle-mage boots";
            itemdef.modelZoom = 987;
            itemdef.modelRotation2 = 1988;
            itemdef.modelRotation1 = 188;
            itemdef.modelOffset1 = -8;
            itemdef.modelOffset2 = 5;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44755;
            itemdef.anInt200 = 44755;
        }
        if(i == 14009)
        {
            itemdef.modelID = 44573;
            itemdef.name = "Battle-mage gloves";
            itemdef.modelZoom = 1053;
            itemdef.modelRotation2 = 0;
            itemdef.modelRotation1 = 536;
            itemdef.modelOffset1 = 3;
            itemdef.modelOffset2 = 0;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44762;
            itemdef.anInt200 = 44762;
        }
        if(i == 14010)
        {
            itemdef.modelID = 44699;
            itemdef.name = "Vanguard gloves";
            itemdef.modelZoom = 830;
            itemdef.modelRotation2 = 0;
            itemdef.modelRotation1 = 536;
            itemdef.modelOffset1 = 9;
            itemdef.modelOffset2 = 3;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44758;
            itemdef.anInt200 = 44758;
        }
        if(i == 14011)
        {
            itemdef.modelID = 44700;
            itemdef.name = "Vanguard boots";
            itemdef.modelZoom = 848;
            itemdef.modelRotation2 = 141;
            itemdef.modelRotation1 = 141;
            itemdef.modelOffset1 = 4;
            itemdef.modelOffset2 = 0;
            itemdef.stackable = false;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.anInt165 = 44752;
            itemdef.anInt200 = 44752;
        }
		if(i == 9899){
	itemdef.name = "Beastly Sword";
	itemdef.description = "Vestige-x";
	itemdef.modelID = 5002; 
	itemdef.anInt165 = 5003; 
	itemdef.anInt200 = 5003; 
	itemdef.modelZoom = 3000;
	itemdef.modelRotation2 = 498;
	itemdef.modelRotation1 = 263;
	itemdef.modelOffset1 = -3;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
		if(i == 20142){
	itemdef.name = "Beastly Sword (d)";
	itemdef.description = "Vestige-x";
	itemdef.modelID = 5002; 
	itemdef.anInt165 = 5003; 
	itemdef.anInt200 = 5003; 
	itemdef.modelZoom = 3000;
	itemdef.modelRotation2 = 498;
	itemdef.modelRotation1 = 263;
	itemdef.modelOffset1 = -3;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 19938){
	itemdef.name = "Spongebob";
	itemdef.description = "It's Spongebob";
	itemdef.modelID = 11122; 
	itemdef.anInt165 = 11123; 
	itemdef.anInt200 = 11123; 
	itemdef.modelZoom = 500;
	itemdef.modelRotation2 = 0;
	itemdef.modelRotation1 = 500;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Pick Up"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Equip";
}
if(i == 14390){
itemdef.name = "Vestige LightSlayer Cape";
itemdef.modelID = 26920;
itemdef.modelZoom = 2000;
itemdef.modelRotation2 = 0;
itemdef.modelRotation1 = 572;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 26921;
itemdef.anInt200 = 26921;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Vestige LightSlayer Cape.";
}

if(i == 11662){
		itemdef.modelID = 75900;
		itemdef.name = "Golden Torva platelegs";
		itemdef.description = "Golden Torva platelegs.";
		itemdef.modelZoom = 1550;
		itemdef.modelRotation2 = 0;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = 5;
		itemdef.modelOffset2 = 11;
		itemdef.anInt165 = 75900;
		itemdef.anInt200 = 75901;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
	}
	
	if(i == 11660){
		itemdef.modelID = 75898;
		itemdef.name = "Golden Torva full helm";
		itemdef.description = "Golden Torva full helm.";
		itemdef.modelZoom = 724;
		itemdef.modelRotation2 = 532;
		itemdef.modelRotation1 = 14;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 75898;
		itemdef.anInt200 = 75899;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
	
	if(i == 11661){
		itemdef.modelID = 75896;
		itemdef.name = "Golden Torva platebody";
		itemdef.description = "Golden Torva platebody.";
		itemdef.modelZoom = 1550;
		itemdef.modelRotation2 = 0;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = 5;
		itemdef.modelOffset2 = 11;
		itemdef.anInt165 = 75896;
		itemdef.anInt200 = 75897;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
	}

if(i == 939){
itemdef.name = "Vestige Light Wings";
itemdef.modelID = 665;
itemdef.modelZoom = 2000;
itemdef.modelRotation2 = 572;
itemdef.modelRotation1 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 666;
itemdef.anInt200 = 666;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Vestige Light Wings.";
itemdef.stackable = false;
}
if(i == 4650){
itemdef.name = "White Wings (t)";
itemdef.modelID = 58025;
itemdef.modelZoom = 2000;
itemdef.modelRotation2 = 572;
itemdef.modelRotation1 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 58024;
itemdef.anInt200 = 58024;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "White Wings (t).";
itemdef.stackable = false;
}
if(i == 4651){
itemdef.name = "Purple Wings";
itemdef.modelID = 58028;
itemdef.modelZoom = 2000;
itemdef.modelRotation2 = 572;
itemdef.modelRotation1 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 58027;
itemdef.anInt200 = 58027;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Purple Wings.";
itemdef.stackable = false;
}
if(i == 4652){
itemdef.name = "Jamaican Wings";
itemdef.modelID = 58034;
itemdef.modelZoom = 2000;
itemdef.modelRotation2 = 572;
itemdef.modelRotation1 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 58033;
itemdef.anInt200 = 58033;
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Jamaican Wings.";
itemdef.stackable = false;
}

if(i == 19936){
	itemdef.name = "Colourful Wings";
	itemdef.description = "Vestige-x Wings";
	itemdef.modelID = 12541; 
	itemdef.anInt165 = 12542; 
	itemdef.anInt200 = 12542; 
	itemdef.modelZoom = 500;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
    }
	if (i == 11626){
			itemdef.modelID = 12281;
			itemdef.name = "Brown Wings";
			itemdef.modelZoom = 850;
			itemdef.modelRotation2 = 252;
			itemdef.modelRotation1 = 1020;
			itemdef.modelOffset1 = -1;
			itemdef.modelOffset2 = 24;
			itemdef.anInt165 = 15008;
			itemdef.anInt200 = 15008;
			itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		
		if (i == 11593){
		itemdef.modelID = 75860;
		itemdef.name = "Pink Wings";
		itemdef.modelZoom = 850;
		itemdef.modelRotation2 = 252;
		itemdef.modelRotation1 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75859;
		itemdef.anInt200 = 75859;	
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 20150){
		itemdef.modelID = 75860;
		itemdef.name = "Pink Wings (d)";
		itemdef.modelZoom = 850;
		itemdef.modelRotation2 = 252;
		itemdef.modelRotation1 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75859;
		itemdef.anInt200 = 75859;	
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 11592){
		itemdef.modelID = 75861;
		itemdef.name = "Red Wings";
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 252;
		itemdef.modelRotation2 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75862;
		itemdef.anInt200 =75862;	
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 20149){
		itemdef.modelID = 75861;
		itemdef.name = "Red Wings (d)";
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 252;
		itemdef.modelRotation2 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75862;
		itemdef.anInt200 =75862;	
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 11591){
		itemdef.modelID = 75863;
		itemdef.name = "Black Wings";
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 252;
		itemdef.modelRotation2 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75864;
		itemdef.anInt200 = 75864;	
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 20148){
		itemdef.modelID = 75863;
		itemdef.name = "Black Wings (d)";
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 252;
		itemdef.modelRotation2 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75864;
		itemdef.anInt200 = 75864;	
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 11590){
		itemdef.modelID = 75865;
		itemdef.name = "Orange Wings";
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 252;
		itemdef.modelRotation2 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75866;
		itemdef.anInt200 = 75866;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 20152){
		itemdef.modelID = 75865;
		itemdef.name = "Orange Wings (d)";
		itemdef.modelZoom = 850;
		itemdef.modelRotation1 = 252;
		itemdef.modelRotation2 = 1020;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 24;
		itemdef.anInt165 = 75866;
		itemdef.anInt200 = 75866;
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		
		if (i == 11627){
			itemdef.modelID = 12282;
			itemdef.name = "White Wings";
			itemdef.modelZoom = 850;
			itemdef.modelRotation1 = 252;
			itemdef.modelRotation2 = 1020;
			itemdef.modelOffset1 = -1;
			itemdef.modelOffset2 = 24;
			itemdef.anInt165 = 12225;
			itemdef.anInt200 = 12225;
			itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
		if (i == 20151){
			itemdef.modelID = 12282;
			itemdef.name = "White Wings (d)";
			itemdef.modelZoom = 850;
			itemdef.modelRotation1 = 252;
			itemdef.modelRotation2 = 1020;
			itemdef.modelOffset1 = -1;
			itemdef.modelOffset2 = 24;
			itemdef.anInt165 = 12225;
			itemdef.anInt200 = 12225;
			itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		}
if(i == 9898){
	itemdef.name = "Cape of vestige";
	itemdef.description = "Another custom cape";
	itemdef.modelID = 11112; 
	itemdef.anInt165 = 11112; 
	itemdef.anInt200 = 11112; 
	itemdef.modelZoom = 1900;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if (i == 11142){
			itemdef.modelID = 5412;
			itemdef.name = "Black Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		        itemdef.anInt165 = 5409;
		        itemdef.anInt200 = 5409;
                        itemdef.modelRotation1 = 280;
                        itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 1;
		}
if (i == 13196){
			itemdef.modelID = 58051;
			itemdef.name = "Rainbow Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
	        itemdef.anInt165 = 58050;
	        itemdef.anInt200 = 58050;
            itemdef.modelRotation1 = 280;
            itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
			itemdef.stackable = false;
		}
if (i == 19939){
			itemdef.modelID = 5412;
			itemdef.name = "Chaotic Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		    itemdef.anInt165 = 5409;
		    itemdef.anInt200 = 5409;
            itemdef.modelRotation1 = 280;
            itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.originalModelColors[0] = 32895;
			itemdef.modifiedModelColors[0] = 944;
			itemdef.stackable = false;
		}
if (i == 11143){
			itemdef.modelID = 5412;
			itemdef.name = "Green Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		        itemdef.anInt165 = 5409;
		        itemdef.anInt200 = 5409;
                        itemdef.modelRotation1 = 280;
                        itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 23421;
		}		
		if (i == 11144){
			itemdef.modelID = 5412;
			itemdef.name = "Pink Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		    itemdef.anInt165 = 5409;
		    itemdef.anInt200 = 5409;
            itemdef.modelRotation1 = 280;
            itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 57300;
		}			
		if (i == 20135){
			itemdef.modelID = 5412;
			itemdef.name = "Pink Whip (d)";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		    itemdef.anInt165 = 5409;
		    itemdef.anInt200 = 5409;
            itemdef.modelRotation1 = 280;
            itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 57300;
		}		
if (i == 11145){
			itemdef.modelID = 5412;
			itemdef.name = "Lime Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		    itemdef.anInt165 = 5409;
		    itemdef.anInt200 = 5409;
            itemdef.modelRotation1 = 280;
            itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 17350;
		}			
		if (i == 20098) {
	itemdef.stackable = false;
	itemdef.modelID = 73831;
	itemdef.name = "Goliath gloves (white)";
	itemdef.anInt165 = 72301;
	itemdef.anInt200 = 72323;
	itemdef.modelZoom = 592;
	itemdef.modelRotation1 = 40;
	itemdef.modelRotation2 = 539;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = -4;
	itemdef.groundActions = new String[6];
	itemdef.groundActions[2] = "Take";
	itemdef.groundActions[5] = "Examine";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Destroy";
	itemdef.originalModelColors = new int[3];
	itemdef.originalModelColors[0] = 64585;
	itemdef.originalModelColors[1] = 64590;
	itemdef.originalModelColors[2] = 64595;
	itemdef.modifiedModelColors = new int[3];
	itemdef.modifiedModelColors[0] = 10;
	itemdef.modifiedModelColors[1] = 15;
	itemdef.modifiedModelColors[2] = 20;
}		
		if (i == 20132) {
	itemdef.stackable = false;
	itemdef.modelID = 73831;
	itemdef.name = "Goliath gloves (white) (d)";
	itemdef.anInt165 = 72301;
	itemdef.anInt200 = 72323;
	itemdef.modelZoom = 592;
	itemdef.modelRotation1 = 40;
	itemdef.modelRotation2 = 539;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = -4;
	itemdef.groundActions = new String[6];
	itemdef.groundActions[2] = "Take";
	itemdef.groundActions[5] = "Examine";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Destroy";
	itemdef.originalModelColors = new int[3];
	itemdef.originalModelColors[0] = 64585;
	itemdef.originalModelColors[1] = 64590;
	itemdef.originalModelColors[2] = 64595;
	itemdef.modifiedModelColors = new int[3];
	itemdef.modifiedModelColors[0] = 10;
	itemdef.modifiedModelColors[1] = 15;
	itemdef.modifiedModelColors[2] = 20;
}
if (i == 20099) {
	itemdef.stackable = false;
	itemdef.modelID = 73831;
	itemdef.name = "Goliath gloves (black)";
	itemdef.anInt165 = 72301;
	itemdef.anInt200 = 72323;
	itemdef.modelZoom = 592;
	itemdef.modelRotation1 = 40;
	itemdef.modelRotation2 = 539;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = -4;
	itemdef.groundActions = new String[6];
	itemdef.groundActions[2] = "Take";
	itemdef.groundActions[5] = "Examine";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Destroy";
}
if (i == 20131) {
	itemdef.stackable = false;
	itemdef.modelID = 73831;
	itemdef.name = "Goliath gloves (black) (d)";
	itemdef.anInt165 = 72301;
	itemdef.anInt200 = 72323;
	itemdef.modelZoom = 592;
	itemdef.modelRotation1 = 40;
	itemdef.modelRotation2 = 539;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = -4;
	itemdef.groundActions = new String[6];
	itemdef.groundActions[2] = "Take";
	itemdef.groundActions[5] = "Examine";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Destroy";
}
		if (i == 11146){
			itemdef.modelID = 5412;
			itemdef.name = "Lava Whip";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.modelZoom = 840;
		    itemdef.anInt165 = 5409;
		    itemdef.anInt200 = 5409;
            itemdef.modelRotation1 = 280;
            itemdef.modelRotation2 = 0;
			itemdef.modelOffset1 = -2;
			itemdef.modelOffset2 = 56;
			itemdef.aByte205 = 7;
			itemdef.aByte154 = -7;
            itemdef.modifiedModelColors = new int[1];
            itemdef.originalModelColors = new int[1];
			itemdef.modifiedModelColors[0] = 944;
			itemdef.originalModelColors[0] = 6073;
		}	
if(i == 19933){
	itemdef.name = "Vestige-x Veteran Cape";
	itemdef.description = "Vestige Vet Cape";
	itemdef.modelID = 14641; 
	itemdef.anInt165 = 14641; 
	itemdef.anInt200 = 14641; 
	itemdef.modelZoom = 2000;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 19934){
	itemdef.name = "Vestige-x Veteran Cape (D)";
	itemdef.description = "Vestige Vet Cape";
	itemdef.modelID = 14641; 
	itemdef.anInt165 = 14641; 
	itemdef.anInt200 = 14641; 
	itemdef.modelZoom = 2000;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}


if(i == 9374){
	itemdef.name = "Cape of vestige";
	itemdef.description = "Another custom cape";
	itemdef.modelID = 11113; 
	itemdef.anInt165 = 11113; 
	itemdef.anInt200 = 11113; 
	itemdef.modelZoom = 500;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 9897){
	itemdef.name = "Foam finger";
	itemdef.description = "Bill presents";
	itemdef.modelID = 2022; 
	itemdef.anInt165 = 2012; 
	itemdef.anInt200 = 2012; 
	itemdef.modelZoom = 1800;
	itemdef.modelRotation2 = 498;
	itemdef.modelRotation1 = 484;
	itemdef.modelOffset1 = -1;
	itemdef.modelOffset2 = 4;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	}
	
if(i == 9894){
	itemdef.name = "Vestige longsword";
	itemdef.description = "Its a vestige longsword.";
	itemdef.modelID = 8254; 
	itemdef.anInt165 = 8255; 
	itemdef.anInt200 = 8255; 
	itemdef.modelZoom = 2000;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 9926){
	itemdef.name = "Vestige longsword (D)";
	itemdef.description = "Its a vestige longsword.";
	itemdef.modelID = 8254; 
	itemdef.anInt165 = 8255; 
	itemdef.anInt200 = 8255; 
	itemdef.modelZoom = 2000;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 19930){
	itemdef.name = "Abyssal Rapier";
	itemdef.description = "Its an Abyysal Rapier.";
	itemdef.modelID = 14646; 
	itemdef.anInt165 = 14648; 
	itemdef.anInt200 = 14647; 
	itemdef.modelZoom = 1600;
	itemdef.modelRotation2 = 500;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 4;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 19935){
	itemdef.name = "Abyssal Rapier (D)";
	itemdef.description = "Its an Abyysal Rapier.";
	itemdef.modelID = 14646; 
	itemdef.anInt165 = 14648; 
	itemdef.anInt200 = 14647; 
	itemdef.modelZoom = 1600;
	itemdef.modelRotation2 = 500;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 4;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 19924){
	itemdef.name = "Vestige Rapier";
	itemdef.description = "Its a Vestige Rapier.";
	itemdef.modelID = 14650; 
	itemdef.anInt165 = 14649; 
	itemdef.anInt200 = 14649; 
	itemdef.modelZoom = 1600;
	itemdef.modelRotation2 = 500;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 4;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 19955){
	itemdef.name = "Vestige M40a3";
	itemdef.description = "Its a m40a3.";
	itemdef.modelID = 9150; 
	itemdef.anInt165 = 9150; 
	itemdef.anInt200 = 9150; 
	itemdef.modelZoom = 2000;
	itemdef.modelRotation2 = 572;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 9895){
	itemdef.name = "Cigarette";
	itemdef.description = "Bill presents";
	itemdef.modelID = 14100; 
	itemdef.anInt165 = 14101; 
	itemdef.anInt200 = 14101; 
	itemdef.modelZoom = 400;
	itemdef.modelRotation2 = 498;
	itemdef.modelRotation1 = 1300;
	itemdef.modelOffset1 = -1;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if(i == 896){
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 14129;
                itemdef.modelZoom = 2000;
                itemdef.modelRotation2 = 572;
                itemdef.modelRotation1 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 14130;
            itemdef.anInt200 = 14130;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
                itemdef.name = "Owner Cape";
                itemdef.description = "A cape worn by Owners.";
    }	
if(i == 914){
		itemdef.modelID = 1019;
		itemdef.name = "Vestige platelegs";
		itemdef.description = "Vestige platelegs.";
		itemdef.modelZoom = 1632;
		itemdef.modelRotation2 = 500;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 7;
		itemdef.anInt165 = 1012;
		itemdef.anInt200 = 1012;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 19810){
		itemdef.modelID = 14506;
		itemdef.name = "Vestige Robe Bottoms";
		itemdef.description = "Vestige Robe Bottoms.";
		itemdef.modelZoom = 400;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 1300;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 14500;
		itemdef.anInt200 = 14500;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 19811){
		itemdef.modelID = 14506;
		itemdef.name = "Vestige Hat";
		itemdef.description = "Vestige Hat.";
		itemdef.modelZoom = 400;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 1300;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 14501;
		itemdef.anInt200 = 14501;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 19812){
		itemdef.modelID = 14508;
		itemdef.name = "Vestige Robe Top";
		itemdef.description = "Vestige Robe Top.";
		itemdef.modelZoom = 400;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 1300;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 14503;
		itemdef.anInt200 = 14503;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 19558){
		itemdef.modelID = 14092;
		itemdef.name = "Baseball Bat";
		itemdef.description = "No Destruction Rofl..";
		itemdef.modelZoom = 2500;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 1300;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 14093;
		itemdef.anInt200 = 14093;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
	if(i == 9396){
			itemdef.modelID = 9001;
			itemdef.name = "Rainbow Partyhat";
			itemdef.description = "Rainbow Partyhat.";
			itemdef.modelZoom = 440;
			itemdef.modelRotation1 = 1845;
			itemdef.modelRotation2 = 121;
			itemdef.modelOffset1 = 0;
			itemdef.modelOffset2 = 1;
			itemdef.anInt165 = 9000;
			itemdef.anInt200 = 9000;
			itemdef.groundActions = new String[5];
			itemdef.groundActions[2] = "Take";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.stackable = false;
		}
        if(i == 15121)
        {
            itemdef.modelID = 65270;
            itemdef.name = "Completionist cape";
            itemdef.modelZoom = 1316;
            itemdef.modelRotation1 = 252;
            itemdef.modelRotation2 = 1020;
            itemdef.modelOffset1 = -1;
            itemdef.modelOffset2 = 24;
            itemdef.stackable = false;
            itemdef.value = 19264;
            itemdef.membersObject = true;
            itemdef.anInt165 = 65297;
            itemdef.anInt200 = 65316;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Customise";
            itemdef.itemActions[3] = "Features";
            itemdef.itemActions[4] = "Destroy";
            itemdef.modifiedModelColors = new int[4];
            itemdef.originalModelColors = new int[4];
            itemdef.modifiedModelColors[0] = 65214;
            itemdef.modifiedModelColors[1] = 65200;
            itemdef.modifiedModelColors[2] = 65186;
            itemdef.modifiedModelColors[3] = 62995;
            itemdef.originalModelColors[0] = 65214;
            itemdef.originalModelColors[1] = 65200;
            itemdef.originalModelColors[2] = 65186;
            itemdef.originalModelColors[3] = 62995;
        }
        if(i >= 1174 && i <= 1435)
            itemdef.aByte154 = -10;
        if(i == 2430)
        {
            itemdef.name = "Special Restore Potion";
            itemdef.description = "It's a potion that restores special!";
        }
        if(i == 2438)
        {
            itemdef.name = "Overload";
            itemdef.description = " An overload potion";
        }
        if(i >= 656 && i <= 665)
            itemdef.aByte154 = -10;
        if(i == 773)
        {
            itemdef.name = "P. Ring";
            itemdef.description = "Owns All Them 1337 in one!";
        }
        if(i == 15017)
        {
            itemdef.name = "Double Xp Ring";
            itemdef.description = "Thanks for Donating!, ENJOY!";
        }
        if(i == 5021)
        {
             itemdef.itemActions = new String[5];
             itemdef.itemActions[1] = "Check";
             itemdef.name = "@red@1bill Check";
             itemdef.description = " A Check";
             itemdef.stackable = false;
        }
        if(i == 5022)
        {
             itemdef.itemActions = new String[5];
             itemdef.itemActions[1] = "Check";
             itemdef.name = "@red@100m Check";
             itemdef.description = " A Check";
             itemdef.stackable = false;
        }
        if(i == 5023)
        {
             itemdef.name = "@red@2bill Check";
             itemdef.description = " A Check";
        }

         if(i == 4067)
        {
             itemdef.name = "@red@2bill Check";
             itemdef.description = " A Check";
        }

        if(i == 17413)
        {
            itemdef.name = "Vial of Water(e)";
            itemdef.description = "A enchanted vial of water, for whip ointment";
        }
        if(i == 4155)
        {
            itemdef.description = "A gem found to be very useful for slayers.";
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[2] = "Check-task";
            itemdef.itemActions[3] = "Check-points";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 962) {
        	itemdef.name = "Christmas cracker";
			itemdef.description = "A christmas cracker from the 2013 Christmas event.";
			itemdef.groundActions = new String[5];
			itemdef.groundActions[2] = "Take";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[2] = "Open";
			itemdef.itemActions[4] = "Drop";
        }
        if(i == 13362){
		itemdef.modelID = 67442;
		itemdef.name = "Torva full helm";
		itemdef.description = "Torva full helm.";
		itemdef.modelZoom = 724;
		itemdef.modelRotation2 = 81;
		itemdef.modelRotation1 = 1670;
		itemdef.modelOffset1 = 0;
		itemdef.modelOffset2 = 0;
		itemdef.anInt165 = 66475;
		itemdef.anInt200 = 66858;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		}	
		if(i == 20116){
		itemdef.modelID = 67442;
		itemdef.name = "Torva full helm (d)";
		itemdef.description = "Torva full helm.";
		itemdef.modelZoom = 724;
		itemdef.modelRotation2 = 81;
		itemdef.modelRotation1 = 1670;
		itemdef.modelOffset1 = 0;
		itemdef.modelOffset2 = 0;
		itemdef.anInt165 = 66475;
		itemdef.anInt200 = 66858;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		}	
		if(i == 11660){
		itemdef.modelID = 75898;
		itemdef.name = "Golden Torva full helm";
		itemdef.description = "Golden Torva full helm.";
		itemdef.modelZoom = 724;
		itemdef.modelRotation2 = 532;
		itemdef.modelRotation1 = 14;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 75898;
		itemdef.anInt200 = 75899;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		}	
		if(i == 19929){
		itemdef.modelID = 72191;
		itemdef.name = "Anonymous Mask";
		itemdef.description = "Anonymous Mask.";
		itemdef.modelZoom = 811;
		itemdef.modelRotation2 = 500;
		itemdef.modelRotation1 = 221;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = 3;
		itemdef.anInt165 = 72101;
		itemdef.anInt200 = 72185;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
		
		
if(i == 938){
		itemdef.modelID = 75930;
		itemdef.name = "Ice Claws";
		itemdef.description = "A Pair Of Ice Claws.";
		itemdef.modelZoom = 2256;
		itemdef.modelRotation2 = 240;
		itemdef.modelRotation1 = 220;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 75930;
		itemdef.anInt200 = 75930;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
	}	
if(i == 13197){
		itemdef.modelID = 62000;
		itemdef.name = "Golden Claws";
		itemdef.description = "A Pair Of Golden Claws.";
		itemdef.modelZoom = 2256;
		itemdef.modelRotation2 = 240;
		itemdef.modelRotation1 = 220;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 62001;
		itemdef.anInt200 = 62001;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
	}	
if(i == 4642){
		itemdef.modelID = 27899;
		itemdef.name = "Primal Claws";
		itemdef.description = "A Pair Of Primal Claws.";
		itemdef.modelZoom = 2256;
		itemdef.modelRotation2 = 240;
		itemdef.modelRotation1 = 220;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 27898;
		itemdef.anInt200 = 27898;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
	}
if(i == 918){
		itemdef.modelID = 24092;
		itemdef.name = "Battleaxe of vestige";
		itemdef.description = "Battleaxe of Vestige.";
		itemdef.modelZoom = 2256;
		itemdef.modelRotation2 = 1646;
		itemdef.modelRotation1 = 519;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 24091;
		itemdef.anInt200 = 24091;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
if(i == 4646){
		itemdef.modelID = 50855;
		itemdef.name = "War Axe";
		itemdef.description = "A War Axe.";
		itemdef.modelZoom = 2256;
		itemdef.modelRotation2 = 1646;
		itemdef.modelRotation1 = 519;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 1;
		itemdef.anInt165 = 50939;
		itemdef.anInt200 = 50939;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
		if(i == 20134){
			itemdef.modelID = 24092;
			itemdef.name = "Battleaxe of vestige (d)";
			itemdef.description = "Battleaxe of Vestige.";
			itemdef.modelZoom = 2256;
			itemdef.modelRotation2 = 1646;
			itemdef.modelRotation1 = 519;
			itemdef.modelOffset1 = -1;
			itemdef.modelOffset2 = 1;
			itemdef.anInt165 = 24091;
			itemdef.anInt200 = 24091;
			itemdef.groundActions = new String[5];
			itemdef.groundActions[2] = "Take";
			itemdef.itemActions = new String[5];
			itemdef.itemActions[1] = "Wear";
			itemdef.itemActions[4] = "Drop";
			itemdef.stackable = false;
		}
		
	if(i == 19958){
		itemdef.modelID = 14623;
		itemdef.name = "Angel Boots";
		itemdef.description = "A pair of Winged Boots.";
		itemdef.modelZoom = 743;
		itemdef.modelRotation2 = 572;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 14623;
		itemdef.anInt200 = 14623;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
	if(i == 20153){
		itemdef.modelID = 14623;
		itemdef.name = "Angel Boots (d)";
		itemdef.description = "A pair of Winged Boots.";
		itemdef.modelZoom = 743;
		itemdef.modelRotation2 = 572;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 14623;
		itemdef.anInt200 = 14623;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
	if(i == 19957){
		itemdef.modelID = 13565;
		itemdef.name = "Barrows boots";
		itemdef.description = "Its A pair of barrows boots.";
		itemdef.modelZoom = 800;
		itemdef.modelRotation2 = 56;
		itemdef.modelRotation1 = 116;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 13565;
		itemdef.anInt200 = 13565;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
	}
	if(i == 19956){
		itemdef.modelID = 10031;
		itemdef.name = "Paper Bag";
		itemdef.description = "To hide your ugly ass face.";
		itemdef.modelZoom = 800;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 484;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 10031;
		itemdef.anInt200 = 10031;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
	}
if(i == 894){
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 14125;
            itemdef.modelZoom = 2000;
            itemdef.modelRotation2 = 572;
            itemdef.modelRotation1 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 14126;
            itemdef.anInt200 = 14126;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
            itemdef.name = "Mod Cape";
            itemdef.description = "A cape worn by player Moderators.";
    }
if(i == 9893){
		itemdef.name = "Admin Godsword";
		itemdef.description = "For Admin Plus Only";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 5000;
            itemdef.modelZoom = 1957;
            itemdef.modelRotation2 = 498;
            itemdef.modelRotation1 = 484;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 5001;
            itemdef.anInt200 = 5001;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
}
if(i == 4058){
		itemdef.name = "Fiery Godsword";
		itemdef.description = "Hot.";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 27645;
            itemdef.modelZoom = 1957;
            itemdef.modelRotation2 = 498;
            itemdef.modelRotation1 = 484;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 27644;
            itemdef.anInt200 = 27644;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
}
if(i == 919){
		itemdef.name = "Vestige Grenade";
		itemdef.description = "Its a F*cking Grenade!!";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 14055;
            itemdef.modelZoom = 1000;
            itemdef.modelRotation2 = 126;
            itemdef.modelRotation1 = 129;
            itemdef.modelOffset1 = -1;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 28;
            itemdef.anInt165 = 14056;
            itemdef.anInt200 = 14056;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
}
if(i == 895){
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 14127;
            itemdef.modelZoom = 2000;
            itemdef.modelRotation2 = 572;
            itemdef.modelRotation1 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 14128;
            itemdef.anInt200 = 14128;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
            itemdef.name = "Admin Cape";
            itemdef.description = "A cape worn by Administrators";
    }
if(i == 4643){
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 27896;
            itemdef.modelZoom = 2000;
            itemdef.modelRotation2 = 572;
            itemdef.modelRotation1 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 27897;
            itemdef.anInt200 = 27897;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
            itemdef.name = "Redslayer Cape";
            itemdef.description = "A Redslayer cape.";
    }
if(i == 4644){
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 27901;
            itemdef.modelZoom = 2000;
            itemdef.modelRotation2 = 572;
            itemdef.modelRotation1 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 27900;
            itemdef.anInt200 = 27900;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
            itemdef.name = "Bloodshed Cape";
            itemdef.description = "A Bloodshed cape.";
    }
if(i == 9900){
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.modelID = 13006;
                itemdef.modelZoom = 4500;
                itemdef.modelRotation2 = 498;
                itemdef.modelRotation1 = 484;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 1;
            itemdef.anInt204 = 0;
            itemdef.anInt165 = 13006;
            itemdef.anInt200 = 13006;
            itemdef.anInt188 = -1;
            itemdef.anInt164 = -1;
            itemdef.anInt175 = -1;
            itemdef.anInt197 = -1;
                itemdef.name = "Vestige Lambo";
                itemdef.description = "WTF, A CAR?!?";
    }
if(i == 19753){
	itemdef.name = "Extreme Sword";
	itemdef.description = "Oh.";
	itemdef.modelID = 9111; 
	itemdef.anInt165 = 9110; 
	itemdef.anInt200 = 9110; 
	itemdef.modelZoom = 2000;
	itemdef.modelRotation2 = 591;
	itemdef.modelRotation1 = 100;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 3;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 10900){
	itemdef.name = "Shadow Sword";
	itemdef.description = "A Shadow Sword";
	itemdef.modelID = 14151; 
	itemdef.anInt165 = 14150; 
	itemdef.anInt200 = 14150; 
	itemdef.modelZoom = 1300;
	itemdef.modelRotation2 = 498;
	itemdef.modelRotation1 = 484;
	itemdef.modelOffset1 = -1;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
if (i == 968) {
		itemdef.modelID = 26419;
		itemdef.name = "Vestige Godsword";
		itemdef.description = "Vestige Godsword.";
		itemdef.modelZoom = 1316;
		itemdef.modelRotation2 = 512;
		itemdef.modelRotation1 = 0;
		itemdef.modelOffset1 = 1;
		itemdef.modelOffset2 = -8;
		itemdef.anInt165 = 26419;
		itemdef.anInt200 = 26419;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
		
		if (i == 930){
		itemdef.modelID = 13086;
		itemdef.name = "Vestige Kitesheild";
		itemdef.description = "Vestige KiteSheild";
		itemdef.modelZoom = 2000;
		itemdef.modelRotation2 = 572;
		itemdef.modelRotation1 = 1200;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = -1;
		itemdef.anInt165 = 13087;
		itemdef.anInt200 = 13087;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
		
if(i == 919){
	itemdef.name = "Snooker Cue";
	itemdef.description = "All we need now is a table, rofl.";
	itemdef.modelID = 26096; 
	itemdef.anInt165 = 26097; 
	itemdef.anInt200 = 26097; 
	itemdef.modelZoom = 2500;
	itemdef.modelRotation2 = 498;
	itemdef.modelRotation1 = 1300;
	itemdef.modelOffset1 = -1;
	itemdef.modelOffset2 = -1;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
}
        if(i == 13360) {
            itemdef.modelID = 67437;
            itemdef.name = "Torva platelegs";
            itemdef.description = "Torva platelegs.";
            itemdef.modelZoom = 1550;
            itemdef.modelRotation1 = 344;
            itemdef.modelRotation2 = 186;
            itemdef.modelOffset1 = 5;
            itemdef.modelOffset2 = 11;
            itemdef.anInt165 = 66593;
            itemdef.anInt200 = 66983;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 20135) {
            itemdef.modelID = 67437;
            itemdef.name = "Torva platelegs (d)";
            itemdef.description = "Torva platelegs.";
            itemdef.modelZoom = 1550;
            itemdef.modelRotation1 = 344;
            itemdef.modelRotation2 = 186;
            itemdef.modelOffset1 = 5;
            itemdef.modelOffset2 = 11;
            itemdef.anInt165 = 66593;
            itemdef.anInt200 = 66983;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 921)
        {
            itemdef.modelID = 10937;
            itemdef.name = "Ganodermic Leggings";
            itemdef.description = "It's Some Ganodermic Leggings";
            itemdef.stackable = false;
            itemdef.modelZoom = 1740;
            itemdef.modelRotation1 = 474;
            itemdef.modelRotation2 = 2045;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -5;
            itemdef.anInt165 = 10486;
            itemdef.anInt200 = 10486;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 11724)
        {
            itemdef.modelID = 67133;
            itemdef.name = "Bandos Chestplate";
            itemdef.description = "It's A Bandos Chestplate";
            itemdef.modelZoom = 1486;
            itemdef.modelRotation1 = 553;
            itemdef.modelRotation2 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 66619;
            itemdef.anInt200 = 67877;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 11726)
        {
            itemdef.modelID = 67132;
            itemdef.name = "Bandos Tassets";
            itemdef.description = "It's Some Bandos Tassets";
            itemdef.modelZoom = 1616;
            itemdef.modelRotation1 = 303;
            itemdef.modelRotation2 = 144;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 15;
            itemdef.anInt165 = 66508;
            itemdef.anInt200 = 67874;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
		 if(i == 933){
		itemdef.modelID = 13543;
		itemdef.name = "Twin Choppers";
		itemdef.description = "Twin Choppers";
		itemdef.modelZoom = 1470;
		itemdef.modelRotation2 = 176;
		itemdef.modelRotation1 = 176;
		itemdef.modelOffset1 = -2;
		itemdef.modelOffset2 = -16;
		itemdef.anInt165 = 13544;
		itemdef.anInt200 = 13544;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
		        if(i == 934){
		itemdef.modelID = 8393;
		itemdef.name = "Energy Sword";
		itemdef.description = "Energy Sword";
		itemdef.modelZoom = 1960;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 484;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 4;
		itemdef.anInt165 = 8393;
		itemdef.anInt200 = 8393;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
        if(i == 4056){
		itemdef.modelID = 15352;
		itemdef.name = "Spiky Greataxes";
		itemdef.description = "Spiky Greataxes";
		itemdef.modelZoom = 1960;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 484;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 4;
		itemdef.anInt165 = 15351;
		itemdef.anInt200 = 15351;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
        if(i == 1000){
		itemdef.modelID = 26306;
		itemdef.name = "Double Greataxes";
		itemdef.description = "Double Greataxes";
		itemdef.modelZoom = 1960;
		itemdef.modelRotation2 = 498;
		itemdef.modelRotation1 = 484;
		itemdef.modelOffset1 = -1;
		itemdef.modelOffset2 = 4;
		itemdef.anInt165 = 26304;
		itemdef.anInt200 = 26304;
		itemdef.groundActions = new String[5];
		itemdef.groundActions[2] = "Take";
		itemdef.itemActions = new String[5];
		itemdef.itemActions[1] = "Wear";
		itemdef.itemActions[4] = "Drop";
		itemdef.stackable = false;
		}
        if(i == 11728) {
            itemdef.modelID = 67131;
            itemdef.name = "Bandos Boots";
            itemdef.description = "It's Some Bandos Boots";
            itemdef.modelZoom = 743;
            itemdef.modelRotation1 = 158;
            itemdef.modelRotation2 = 159;
            itemdef.modelOffset1 = 5;
            itemdef.modelOffset2 = -7;
            itemdef.anInt165 = 66320;
            itemdef.anInt200 = 67866;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 20119) {
            itemdef.modelID = 67131;
            itemdef.name = "Bandos Boots (d)";
            itemdef.description = "It's Some Bandos Boots";
            itemdef.modelZoom = 743;
            itemdef.modelRotation1 = 158;
            itemdef.modelRotation2 = 159;
            itemdef.modelOffset1 = 5;
            itemdef.modelOffset2 = -7;
            itemdef.anInt165 = 66320;
            itemdef.anInt200 = 67866;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 922)
        {
            itemdef.modelID = 10935;
            itemdef.name = "Ganodermic Visor";
            itemdef.description = "It's a Ganodermic Visor";
            itemdef.stackable = false;
            itemdef.modelZoom = 789;
            itemdef.modelRotation1 = 67;
            itemdef.modelRotation2 = 175;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -5;
            itemdef.anInt165 = 10523;
            itemdef.anInt200 = 10523;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 920)
        {
            itemdef.modelID = 10919;
            itemdef.name = "Ganodermic Poncho";
            itemdef.description = "It's a Ganodermic Poncho";
            itemdef.stackable = false;
            itemdef.modelZoom = 1513;
            itemdef.modelRotation1 = 384;
            itemdef.modelRotation2 = 0;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 10490;
            itemdef.anInt200 = 10490;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 9721)
            itemdef.name = "Overload Guide";
        if(i == 15707)
        {
            itemdef.name = "Ring of Kinship";
            itemdef.itemActions[0] = "Tele to Dung";
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Change Colour";
            itemdef.itemActions[3] = "Drop";
        }
        if(i == 18817)
        {
            itemdef.name = "Ring of Kinship";
            itemdef.itemActions[0] = "Tele to Dung";
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Change Colour";
            itemdef.itemActions[3] = "Drop";
        }
        if(i == 18823)
        {
            itemdef.name = "Ring of Kinship";
            itemdef.itemActions[0] = "Tele to Dung";
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Change Colour";
            itemdef.itemActions[3] = "Drop";
        }
        if(i == 18821)
        {
            itemdef.name = "Ring of Kinship";
            itemdef.itemActions[0] = "Tele to Dung";
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Change Colour";
            itemdef.itemActions[3] = "Drop";
        }
        if(i == 9719)
            itemdef.name = "Extremes Guide";
        if(i == 13358) {
            itemdef.modelID = 67440;
            itemdef.name = "Torva platebody";
            itemdef.description = "Torva Platebody.";
            itemdef.modelZoom = 1513;
            itemdef.modelRotation1 = 566;
            itemdef.modelRotation2 = 0;
            itemdef.modelOffset1 = 1;
            itemdef.modelOffset2 = -8;
            itemdef.anInt165 = 66680;
            itemdef.anInt200 = 67072;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 20118) {
            itemdef.modelID = 67440;
            itemdef.name = "Torva platebody (d)";
            itemdef.description = "Torva Platebody.";
            itemdef.modelZoom = 1513;
            itemdef.modelRotation1 = 566;
            itemdef.modelRotation2 = 0;
            itemdef.modelOffset1 = 1;
            itemdef.modelOffset2 = -8;
            itemdef.anInt165 = 66680;
            itemdef.anInt200 = 67072;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 13355)
        {
            itemdef.modelID = 62693;
            itemdef.name = "Pernix cowl";
            itemdef.description = "Pernix cowl";
            itemdef.modelZoom = 800;
            itemdef.modelRotation1 = 532;
            itemdef.modelRotation2 = 14;
            itemdef.modelOffset1 = -1;
            itemdef.modelOffset2 = 1;
            itemdef.anInt165 = 62739;
            itemdef.anInt200 = 62756;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
            itemdef.anInt175 = 62731;
            itemdef.anInt197 = 62727;
        }
        if(i == 13354)
        {
            itemdef.modelID = 62709;
            itemdef.name = "Pernix body";
            itemdef.description = "Pernix body";
            itemdef.modelZoom = 1378;
            itemdef.modelRotation1 = 485;
            itemdef.modelRotation2 = 2042;
            itemdef.modelOffset1 = -1;
            itemdef.modelOffset2 = 7;
            itemdef.anInt165 = 62744;
            itemdef.anInt200 = 62765;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 13352)
        {
            itemdef.modelID = 62695;
            itemdef.name = "Pernix chaps";
            itemdef.description = "Pernix chaps";
            itemdef.modelZoom = 1740;
            itemdef.modelRotation1 = 504;
            itemdef.modelRotation2 = 0;
            itemdef.modelOffset1 = 4;
            itemdef.modelOffset2 = 3;
            itemdef.anInt165 = 62741;
            itemdef.anInt200 = 62757;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 13350)
        {
            itemdef.modelID = 62710;
            itemdef.name = "Virtus mask";
            itemdef.description = "Virtus mask";
            itemdef.modelZoom = 928;
            itemdef.modelRotation1 = 406;
            itemdef.modelRotation2 = 2041;
            itemdef.modelOffset1 = 1;
            itemdef.modelOffset2 = -5;
            itemdef.anInt165 = 62736;
            itemdef.anInt200 = 62755;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
            itemdef.anInt175 = 62728;
            itemdef.anInt197 = 62728;
        }
		
		if(i == 13347){
itemdef.modelID = 75856;
itemdef.name = "Chaotic claws";
itemdef.description = "A pair of chaotic slashing claws";
itemdef.modelZoom = 1160;
itemdef.modelRotation2 = 240;
itemdef.modelRotation1 = 220;
itemdef.modelOffset1 = 3;
itemdef.modelOffset2 = 4;
itemdef.anInt165 = 75857; 
itemdef.anInt200 = 75857;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
		if(i == 4063){
itemdef.modelID = 28999;
itemdef.name = "Colorful Claws";
itemdef.description = "A pair of rainbow slashing claws";
itemdef.modelZoom = 1160;
itemdef.modelRotation2 = 240;
itemdef.modelRotation1 = 220;
itemdef.modelOffset1 = 3;
itemdef.modelOffset2 = 4;
itemdef.anInt165 = 28998; 
itemdef.anInt200 = 28998;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
		if(i == 20120){
itemdef.modelID = 75856;
itemdef.name = "Chaotic claws (d)";
itemdef.description = "A pair of chaotic slashing claws";
itemdef.modelZoom = 1160;
itemdef.modelRotation2 = 240;
itemdef.modelRotation1 = 220;
itemdef.modelOffset1 = 3;
itemdef.modelOffset2 = 4;
itemdef.anInt165 = 75857; 
itemdef.anInt200 = 75857;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.itemActions[4] = "Drop";
}
		
        if(i == 13348)
        {
            itemdef.modelID = 62704;
            itemdef.name = "Virtus robe top";
            itemdef.description = "Virtus robe top";
            itemdef.modelZoom = 1122;
            itemdef.modelRotation1 = 488;
            itemdef.modelRotation2 = 3;
            itemdef.modelOffset1 = 1;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 62748;
            itemdef.anInt200 = 62764;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 13346)
        {
            itemdef.modelID = 62700;
            itemdef.name = "Virtus robe legs";
            itemdef.description = "Virtus robe legs";
            itemdef.modelZoom = 1740;
            itemdef.modelRotation1 = 498;
            itemdef.modelRotation2 = 2045;
            itemdef.modelOffset1 = -1;
            itemdef.modelOffset2 = 4;
            itemdef.anInt165 = 62742;
            itemdef.anInt200 = 62758;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[2] = "Check-charges";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 13344)
        {
            itemdef.modelID = 62694;
            itemdef.name = "Ancient ceremonial hood";
            itemdef.modelZoom = 980;
            itemdef.modelRotation1 = 208;
            itemdef.modelRotation2 = 220;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -18;
            itemdef.anInt165 = 62737;
            itemdef.anInt200 = 62753;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
            itemdef.anInt175 = 62730;
            itemdef.anInt197 = 62730;
        }
        if(i == 13342)
        {
            itemdef.modelID = 62705;
            itemdef.name = "Ancient ceremonial top";
            itemdef.modelZoom = 1316;
            itemdef.modelRotation1 = 477;
            itemdef.modelRotation2 = 9;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = 13;
            itemdef.anInt165 = 62745;
            itemdef.anInt200 = 62763;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
            itemdef.anInt204 = 54;
        }
        if(i == 13340)
        {
            itemdef.modelID = 62707;
            itemdef.name = "Ancient ceremonial legs";
            itemdef.modelZoom = 1828;
            itemdef.modelRotation1 = 539;
            itemdef.modelRotation2 = 0;
            itemdef.modelOffset1 = -1;
            itemdef.modelOffset2 = 0;
            itemdef.anInt165 = 62740;
            itemdef.anInt200 = 62759;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
            itemdef.anInt204 = 40;
            itemdef.anInt196 = 30;
            itemdef.anInt184 = 100;
        }
        if(i == 13370)
        {
            itemdef.modelID = 62697;
            itemdef.name = "Ancient ceremonial gloves";
            itemdef.modelZoom = 548;
            itemdef.modelRotation1 = 618;
            itemdef.modelRotation2 = 1143;
            itemdef.modelOffset1 = 0;
            itemdef.modelOffset2 = -5;
            itemdef.anInt165 = 62735;
            itemdef.anInt200 = 62752;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 7786)
        {
            itemdef.modelID = 6702;
            itemdef.name = "Whip vine";
            itemdef.description = "Use on an abyssal whip for added oomph!";
            itemdef.modelZoom = 2434;
            itemdef.modelRotation2 = 420;
            itemdef.modelRotation1 = 0;
            itemdef.modelOffset1 = 2;
            itemdef.modelOffset2 = -3;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[4] = "Drop";
        }
        if(i == 7783)
        {
            itemdef.modelID = 6701;
            itemdef.name = "Aqua Whip";
            itemdef.description = "The Whip Of The Abyss Blessed by the Hyrdas";
            itemdef.modelRotation1 = 324;
            itemdef.modelRotation2 = 1808;
            itemdef.modelOffset2 = -2;
            itemdef.modelOffset1 = 3;
            itemdef.anInt165 = 6700;
            itemdef.anInt200 = 6700;
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wield";
            itemdef.itemActions[2] = "Split";
            itemdef.itemActions[4] = "Drop";
        }
		if (i == 11631){
	itemdef.name = "Bud shield";
	itemdef.description = "Its a stoners life.";
	itemdef.modelID = 75869; 
	itemdef.anInt165 = 75869; 
	itemdef.anInt200 = 75869; 
	itemdef.modelZoom = 2100;
	itemdef.modelRotation2 = 336;
	itemdef.modelRotation1 = 336;
	itemdef.modelOffset1 = 1;
	itemdef.modelOffset2 = 17;
	itemdef.groundActions = new String[5]; 
	itemdef.groundActions[2] = "Take"; 
	itemdef.itemActions = new String[5]; 
	itemdef.itemActions[1] = "Wear";
	itemdef.stackable = false;
}
if(i == 11607){
	itemdef.name = "Dragonbone full helm";
	itemdef.modelZoom = 780;
	itemdef.modelRotation2 = 229;
	itemdef.modelRotation1 = 177;
	itemdef.modelOffset2 = 1;
	itemdef.modelOffset1 = -34;
	itemdef.groundActions = new String[5];
	itemdef.groundActions[2] = "Take";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Drop";
	itemdef.modelID = 70729;
	itemdef.anInt165 = 70662;
	itemdef.anInt200 = 70691;
}
if(i == 11608){
	itemdef.name = "Dragonbone platebody";
	itemdef.modelZoom = 1758;
	itemdef.modelRotation2 = 512;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset2 = 1;
	itemdef.groundActions = new String[5];
	itemdef.groundActions[2] = "Take";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Drop";
	itemdef.modelID = 70730;
	itemdef.anInt165 = 70669;
	itemdef.anInt200 = 70698;
}
if(i == 11609){
	itemdef.name = "Dragonbone gloves";
	itemdef.modelZoom = 760;
	itemdef.modelRotation2 = 552;
	itemdef.modelRotation1 = 28;
	itemdef.modelOffset2 = 3;
	itemdef.modelOffset1 = 11;
	itemdef.groundActions = new String[5];
	itemdef.groundActions[2] = "Take";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Drop";
	itemdef.modelID = 70725;
	itemdef.anInt165 = 70655;
	itemdef.anInt200 = 70684;
}
if(i == 11610){
	itemdef.name = "Dragonbone boots";
	itemdef.modelZoom = 921;
	itemdef.modelRotation2 = 303;
	itemdef.modelRotation1 = 257;
	itemdef.modelOffset2 = 12;
	itemdef.modelOffset1 = 18;
	itemdef.groundActions = new String[5];
	itemdef.groundActions[2] = "Take";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Drop";
	itemdef.modelID = 70731;
	itemdef.anInt165 = 70653;
	itemdef.anInt200 = 70682;
}
if(i == 11611){
	itemdef.name = "Dragonbone platelegs";
	itemdef.modelZoom = 1772;
	itemdef.modelRotation2 = 512;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 5;
	itemdef.groundActions = new String[5];
	itemdef.groundActions[2] = "Take";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Drop";
	itemdef.modelID = 70728;
	itemdef.anInt165 = 70665;
	itemdef.anInt200 = 70695;
}
if(i == 11612){
	itemdef.name = "Dragonbone plateskirt";
	itemdef.modelZoom = 1772;
	itemdef.modelRotation2 = 512;
	itemdef.modelRotation1 = 0;
	itemdef.modelOffset1 = 5;
	itemdef.groundActions = new String[5];
	itemdef.groundActions[2] = "Take";
	itemdef.itemActions = new String[5];
	itemdef.itemActions[1] = "Wear";
	itemdef.itemActions[4] = "Drop";
	itemdef.modelID = 70724;
	itemdef.anInt165 = 70666;
	itemdef.anInt200 = 70694;
}
if (i == 11634){
itemdef.name = "Ganja Cape";
itemdef.modelID = 75873;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 75873;
itemdef.anInt200 = 75873;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Vestige Ganja Cape.";
}
if (i == 4059){
itemdef.name = "Achievements Cape";
itemdef.modelID = 27657;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 27656;
itemdef.anInt200 = 27656;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Vestige Achievements Cape.";
}
if (i == 4060){
itemdef.name = "Epic Cape";
itemdef.modelID = 27646;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 27646;
itemdef.anInt200 = 27646;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Prove You're Epic!";
}
if (i == 4061){
itemdef.name = "Love Cape";
itemdef.modelID = 27646;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 27647;
itemdef.anInt200 = 27647;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Prove You're Lovely!";
}
if (i == 4062){
itemdef.name = "Winged Donator Cape";
itemdef.modelID = 27830;
itemdef.modelZoom = 2000;
itemdef.modelRotation1 = 572;
itemdef.modelRotation2 = 0;
itemdef.modelOffset1 = 0;
itemdef.modelOffset2 = 1;
itemdef.anInt165 = 27831;
itemdef.anInt200 = 27831;
itemdef.groundActions = new String[5];
itemdef.groundActions[2] = "Take";
itemdef.itemActions = new String[5];
itemdef.itemActions[1] = "Wear";
itemdef.description = "Winged Donator Cape!";
}

        if(i == 13356)
        {
            itemdef.modelID = 62696;
            itemdef.name = "Ancient ceremonial boots";
            itemdef.modelZoom = 676;
            itemdef.modelRotation1 = 63;
            itemdef.modelRotation2 = 106;
            itemdef.modelOffset1 = 5;
            itemdef.modelOffset2 = -1;
            itemdef.anInt165 = 62734;
            itemdef.anInt200 = 62751;
            itemdef.groundActions = new String[5];
            itemdef.groundActions[2] = "Take";
            itemdef.itemActions = new String[5];
            itemdef.itemActions[1] = "Wear";
            itemdef.itemActions[4] = "Drop";
        }
        switch(itemdef.id)
        {
        case 74: // 'J'
        case 580: 
        case 656: 
        case 1017: 
        case 1038: 
        case 1040: 
        case 1042: 
        case 1044: 
        case 1046: 
        case 1048: 
        case 1053: 
        case 1055: 
        case 1057: 
        case 1137: 
        case 1139: 
        case 1141: 
        case 1143: 
        case 1145: 
        case 1147: 
        case 1149: 
        case 1151: 
        case 1153: 
        case 1155: 
        case 1157: 
        case 1159: 
        case 1161: 
        case 1163: 
        case 1165: 
        case 1167: 
        case 1169: 
        case 1171: 
        case 1173: 
        case 1949: 
        case 2522: 
        case 2651: 
        case 2657: 
        case 2659: 
        case 2665: 
        case 2667: 
        case 2673: 
        case 2675: 
        case 2758: 
        case 2890: 
        case 2900: 
        case 2902: 
        case 2910: 
        case 2912: 
        case 2920: 
        case 2922: 
        case 2930: 
        case 2932: 
        case 2940: 
        case 2942: 
        case 3122: 
        case 3488: 
        case 4151: 
        case 4156: 
        case 4212: 
        case 4224: 
        case 4225: 
        case 4235: 
        case 4587: 
        case 4675: 
        case 6523: 
        case 6524: 
        case 6629: 
        case 6631: 
        case 11283: 
        case 11284: 
        case 11285: 
        case 11286: 
        case 11694: 
        case 11696: 
        case 11698: 
        case 11700: 
        case 11730: 
        case 20072: 
            itemdef.aByte154 = -10;
            break;
        }
        return itemdef;
    }
}