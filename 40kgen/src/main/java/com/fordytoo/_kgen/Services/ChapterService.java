package com.fordytoo._kgen.Services;

import com.fordytoo._kgen.Repositories.ChapterRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ChapterService {
    private final ChapterRepository chapterRepository;
    private final Random random = new Random();

    private final List<String> whyFoundedOptions = Arrays.asList(
            "Strategic Prognostication", "Counter", "Standing Force", "Crusade"
    );

    private final List<String> whenFoundedOptions = Arrays.asList(
            "Unsupported claim of Second Founding status", "Late M31; Third Founding",
            "Unknown", "32nd Millennium", "33rd Millennium", "34th Millennium",
            "M35; 9th-13th Founding", "M35; 14th-20th Founding", "991.M35; 21st (\"Cursed\") Founding",
            "36th Millennium", "37th Millennium", "M38; 23rd (\"Sentinel\") Founding",
            "39th Millennium; 24th Founding", "40th Millennium; 25th (\"Bastion\") Founding",
            "41st Millennium; 26th Founding", "M41/M42; Ultima Founding"
    );

    private final List<String> progenitorOptions = Arrays.asList(
            "Ultramarines", "Blood Angels", "Dark Angels", "Traitor Legion or unknown",
            "Imperial Fists", "White Scars", "Raven Guard", "Iron Hands",
            "Space Wolves", "Salamanders"
    );

    private final List<String> gsPurityOptions = Arrays.asList(
            "Pure - Same as progenitor in terms of purity, and will maintain close links with it ",
            "A New Generation - Gene-seed is slightly divergent, leading to the Chapter being less linked to its progenitor",
            "Altered Stock - Gene-seed is altered and some implants are deficient",
            "Flawed - Chapter's gene-seed is flawed and sets them apart from their progenitor"
    );

    private final List<String> demeanourOptions = Arrays.asList(
            "Swift As The Wind - Going slowly and thinking things out? *BLAM* NO",
            "Cleanse and Purify - Not destroy everything? *BLAM* NO",
            "No Mercy, No Respite - Let the enemy go so we can follow them? *BLAM* NO",
            "Purity Above All - Mutants? *BLAM* NO",
            "Scions of Mars - Flesh is strong? *BLAM* NO",
            "See, But Don't Be Seen - Run onto the battlefield in colourful armour screaming like a maniac? *BLAM* NO",
            "Suffer Not the Alien to Live - Xenos? *BLAM* NO",
            "Suffer Not the Work of Heretics - Heretics? *BLAM* NO",
            "Brothers in Battle - Hos before bros? *BLAM* NO",
            "Uphold the Honour of the Emperor - Performing unheroic acts? *BLAM* NO"
    );

    private final List<String> figureOfLegendOptions = Arrays.asList(
            "A Battle-Brother seconded from a previous generation Successor or even the First Founding Legion that provided the new Chapter’s gene-seed.",
            "Chapter Master",
            "Chapter/Company Champion (roll D2 to determine Chapter (1) or Company (2), if Company roll d10 to determine which company)",
            "Chief Librarian",
            "Master of Sanctity",
            "Master of the Forge",
            "Master of the Fleet (who wasn't the Fourth Company Captain, either due to temporary step down or the post being separately appointed as a full-time Marine)",
            "Chief Apothecary",
            "Company Captain (roll d10 to determine which company)",
            "Company Lieutenant (roll d10 to determine which company, roll d2 to determine Junior (1) or Senior (2) lieutenant)",
            "Squad Sergeant (roll d10 twice to determine company and squad)",
            "Battle-Brother (roll d10 twice to determine company and squad)",
            "A specialist of your choice (Librarian, Chaplain, Techmarine, driver, pilot, etc)"
    );

    private final List<String> deedsOfLegendOptions = Arrays.asList(
            "The figure is remembered as the bane of the Orks, to such an extent that his name is known to the vile greenskins even to this day.",
            "The individual was a stalwart enemy of the servants of Chaos, and slew a Daemon Prince.",
            "The hero led a glorious campaign against a rebel army, defeating the foe and bringing an entire sector back into the light of the Emperor.",
            "The figure led an action against an Eldar craftworld, boarding it and inflicting grievous casualties before withdrawing. He and his Chapter are especially hated by the pernicious Eldar, for whom the event is still fresh and raw.",
            "The hero was lost to his Chapter in a warp accident, yet his descendants have cause to believe he lives still and may one day return to them in glory.",
            "The hero was the first to face some newly discovered alien race, and ultimately responsible for its total destruction. Centuries later, only the Chapter remembers the name of the race, so utterly was it and its works cast down.",
            "The hero led his Chapter in many glorious campaigns, slaying hundreds of the enemy’s greatest champions. In the end, he was brought down by the Chapter's enemies, and is a reminder to all Battle Brothers of their holy duty."
    );

    private final List<String> beliefsOptions = Arrays.asList(
            "Revere the Primarch - \"Our Spiritual Liege is better than yours!\" (can reroll if lineage is unknown)",
            "The Emperor Above All - \"Screw your spiritual liege. The big E is where it's at.\"",
            "Honour the Ancestors - \"Old members of our Chapter are better than your guys.\"",
            "Death Cult - \"SHUT UP YOU GUYS DON'T YOU KNOW WE'RE GOING TO DIE SOME DAY\"",
            "Totem Creature - \"You know how we've got an animal as our Chapter symbol? Yeah, we're going to stick that everywhere.\"",
            "Purity of Man - \"Flesh is better than bionics!\"",
            "Steel Over Flesh - \"Bionics are better than flesh!\"",
            "Esoteric Beliefs - You know our Chapter's beliefs? They're weird."
    );

    public ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    public String getRandomWhyFounded() {
        int roll = random.nextInt(10);
        if (roll < 4) {
            return whyFoundedOptions.get(0);
        } else if (roll < 6) {
            return whyFoundedOptions.get(1);
        }
        else if (roll < 8) {
            return whyFoundedOptions.get(2);
        }
        else {
            return whyFoundedOptions.get(3);
        }
    }

    public String getRandomWhenFounded() {
        int roll = random.nextInt(100);
        if (roll < 1) {
            return whenFoundedOptions.get(0);
        }
        else if (roll < 2) {
            return whenFoundedOptions.get(1);
        }
        else if (roll < 10) {
            return whenFoundedOptions.get(2);
        }
        else if (roll < 15) {
            return whenFoundedOptions.get(3);
        }
        else if (roll < 20) {
            return whenFoundedOptions.get(4);
        }
        else if (roll < 25) {
            return whenFoundedOptions.get(5);
        }
        else if (roll < 30) {
            return whenFoundedOptions.get(6);
        }
        else if (roll < 40) {
            return whenFoundedOptions.get(7);
        }
        else if (roll < 50) {
            return whenFoundedOptions.get(8);
        }
        else if (roll < 55) {
            return whenFoundedOptions.get(9);
        }
        else if (roll < 60) {
            return whenFoundedOptions.get(10);
        }
        else if (roll < 66) {
            return whenFoundedOptions.get(11);
        }
        else if (roll < 72) {
            return whenFoundedOptions.get(12);
        }
        else if (roll < 78) {
            return whenFoundedOptions.get(13);
        }
        else if (roll < 84) {
            return whenFoundedOptions.get(14);
        }
        else {
            return whenFoundedOptions.get(15);
        }
    }

    public String getRandomProgenitor() {
        int roll = random.nextInt(100);
        if (roll < 50) {
            return progenitorOptions.get(0);
        }
        else if (roll < 65) {
            return progenitorOptions.get(1);
        }
        else if (roll < 75) {
            return progenitorOptions.get(2);
        }
        else if (roll < 80) {
            return progenitorOptions.get(3);
        }
        else if (roll < 85) {
            return progenitorOptions.get(4);
        }
        else if (roll < 90) {
            return progenitorOptions.get(5);
        }
        else if (roll < 95) {
            return progenitorOptions.get(6);
        }
        else if (roll < 98) {
            return progenitorOptions.get(7);
        }
        else if (roll < 99) {
            return progenitorOptions.get(8);
        }
        else {
            return progenitorOptions.get(9);
        }
    }

    public String getRandomGsPurity() {
        int roll = random.nextInt(10);
        if (roll < 5) {
            return gsPurityOptions.get(0);
        }
        else if (roll < 7) {
            return gsPurityOptions.get(1);
        }
        else if (roll < 9) {
            return gsPurityOptions.get(2);
        }
        else {
            return gsPurityOptions.get(3);
        }
    }

    public String getRandomDemeanour() {
        return demeanourOptions.get(random.nextInt(demeanourOptions.size()));
    }

    public String getRandomFigure() {
        int roll = random.nextInt(100);
        if (roll < 20) {
            return figureOfLegendOptions.get(0);
        }
        else if (roll < 40) {
            return figureOfLegendOptions.get(1);
        }
        else if (roll < 50) {
            return figureOfLegendOptions.get(2);
        }
        else if (roll < 60) {
            return figureOfLegendOptions.get(3);
        }
        else if (roll < 70) {
            return figureOfLegendOptions.get(4);
        }
        else if (roll < 73) {
            return figureOfLegendOptions.get(5);
        }
        else if (roll < 74) {
            return figureOfLegendOptions.get(6);
        }
        else if (roll < 75) {
            return figureOfLegendOptions.get(7);
        }
        else if (roll < 85) {
            return figureOfLegendOptions.get(8);
        }
        else if (roll < 90) {
            return figureOfLegendOptions.get(9);
        }
        else if (roll < 95) {
            return figureOfLegendOptions.get(10);
        }
        else if (roll < 99) {
            return figureOfLegendOptions.get(11);
        }
        else {
            return figureOfLegendOptions.get(12);
        }
    }

    public String getRandomDeeds() {
        int roll = random.nextInt(100);
        if (roll < 17) {
            return deedsOfLegendOptions.get(0);
        }
        else if (roll < 45) {
            return deedsOfLegendOptions.get(1);
        }
        else if (roll < 60) {
            return deedsOfLegendOptions.get(2);
        }
        else if (roll < 75) {
            return deedsOfLegendOptions.get(3);
        }
        else if (roll < 85) {
            return deedsOfLegendOptions.get(4);
        }
        else if (roll < 93) {
            return deedsOfLegendOptions.get(5);
        }
        else {
            return deedsOfLegendOptions.get(6);
        }
    }

    public String getRandomBeliefs() {
        int roll = random.nextInt(100);
        if (roll < 40) {
            return beliefsOptions.get(0);
        }
        else if (roll < 65) {
            return beliefsOptions.get(1);
        }
        else if (roll < 75) {
            return beliefsOptions.get(2);
        }
        else if (roll < 80) {
            return beliefsOptions.get(3);
        }
        else if (roll < 85) {
            return beliefsOptions.get(4);
        }
        else if (roll < 90) {
            return beliefsOptions.get(5);
        }
        else if (roll < 95) {
            return beliefsOptions.get(6);
        }
        else {
            return beliefsOptions.get(7);
        }
    }
}
