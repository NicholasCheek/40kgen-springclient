package com.fordytoo._kgen.Services;

import com.fordytoo._kgen.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final Random random = new Random();

    private final List<String> originatorOptions = Arrays.asList(
            "Order of Our Martyred Lady", "Order of the Valorous Heart", "Order of the Ebon Chalice",
            "Order of the Argent Shroud", "Order of the Bloody Rose", "Order of the Sacred Rose"
    );

    private final List<String> foundingOptions = Arrays.asList(
            "M36: During the Age of Apostasy, the progenitor unit of the Order became distinct within the Daughters of the Emperor and was formed from its Order Majoris progenitor some time after the Thorian reformation but just before the Age of Apostasy ended, among the first Orders Minoris",
            "M37: The Order was founded during the Age of Redemption, after the first Orders Minoris.",
            "M38: The Order was founded during the Crusades of the Fringe, still within the Age of Redemption",
            "M39: The Order was founded during the beginning of the The Waning from the wave of veterans after the Crusades of the Fringe ended.",
            "M40: The Order was founded during The Waning.",
            "M41: The Order was founded during the last century of The Waning or the Time of Ending.",
            "999.M41/000.M42: The Order was founded during the beginning of the Indomitus Crusade, possibly due to the Great Rift isolating one or more convents and causing de facto independence.",
            "000.M42-Present: The Order was founded during the Age of the Dark Imperium, between the beginning of the Indomitus Crusade or just after the end of the first phase after the Battle of Raukos in 012.M42.",
            "Unknown Founding, though it is likely within the Age of Redemption or the The Waning."
    );

    private final List<String> flawOptions = Arrays.asList(
            "We Stand Alone - The Order is either distrusted for some reason or otherwise cloaks itself from prying eyes.",
            "Pride in the Colours - The Order refuses to submit to any authority outside of the High Lords of Terra or the Inquisition. Note that a formal Imperial Crusade's Warmaster is expected to be obeyed as holding authority in the name of the High Lords.",
            "Faith in Suspicion - The Order particularly hates a single Imperial institution, and refuses to work with them.",
            "An Eye for an Eye - The Order refuses to use the tactics of cowards and will sacrifice every soldier before retreating.",
            "Esoteric Cult - Although not necessarily having bad relations with the wider Ecclesiarchy, The Order has deviated from the Imperial Cult in a significant way that would be noticeable to the Orthodox Imperial Cult such as being a Death Cult, being surprisingly tolerant of psykers, or otherwise. Extremes of such deviance may even involve human sacrifice conducted by the Sisters, or even more unsavory elements that may be outright proscribed outside of necessity like cannibalism. Such matters are best kept hidden."
    );

    private final List<String> demeanourOptions = Arrays.asList(
            "Swift As The Wind - Crush the Heretic before they realize we are here!",
            "Cleanse and Purify - Burn it all, let the Emperor decide the just!",
            "No Mercy, No Respite - Give chase and crush them!",
            "Purity Above All - Your plea of innocence is guilty of wasting my time!",
            "Relic Keepers - The remnants of the saints of old must be preserved.",
            "See, But Don't Be Seen - Stay sensible, stay alive.",
            "Suffer Not the Alien to Live - The Xenos shall fall this day!",
            "Suffer Not the Work of Heretics - The Heretics shall fall this day!",
            "Sisters in Battle - Your sisters are your life and your hoes!",
            "Uphold the Honour of the Emperor - Let His light guide you!"
    );

    private final List<String> primarySaintOptions = Arrays.asList(
            "The Founder is the figure of legend.",
            "Canoness Superior",
            "(Formerly) Living Saint",
            "Seraphim Commander",
            "Celestian Commander",
            "Sister Superior",
            "Battle Sister",
            "A specialist of your choice."
    );

    private final List<String> saintDeedOptions = Arrays.asList(
            "The figure is remembered as the bane of the Orks, purging the foul xenos wherever possible.",
            "The individual was a stalwart enemy of the servants of Chaos, and slew a Daemon Prince.",
            "The saint led a glorious campaign against a rebel army, defeating the foe and bringing an entire sector back into the light of the Emperor.",
            "The figure led an action against an aeldari craftworld, boarding it and inflicting grievous casualties before withdrawing. This has earned the order the fear and hatred of that craftworld.",
            "Lives still and may one day return to them in glory.",
            "The Saint was the first to face some newly discovered alien race, and ultimately responsible for its total destruction. Centuries later, only the Order remembers the name of the race, so utterly was it slain and its works cast down.",
            "The saint led the Order in many glorious campaigns, slaying hundreds of the enemy’s greatest champions. In the end, they were brought down by treachery within the fold of the Imperium, slain by an assassin’s turbo-penetrator round on the field of battle. Just why they were targeted was never discovered, and the Order harbours doubts of the loyalty of the servants of the Officio Assassinorum to this day"
    );

    private final List<String> homeworldOptions = Arrays.asList(
            "Hive World: The noble houses of the Spires are always eager to buy the Emperor's approval with gifts to the Order and the more pious inhabitants of the underhive can make for exeptional Warriors should they be willing to leave their gangs behind in favour of the Emperor, not to mention the Schola Progenium can have live fire exercises in the underhive",
            "Civilised World (A.K.A. Cathedral Worlds): Foolish is he who thinks the civilised worlder a soft target, those who have seen good will give back with all the more zeal.",
            "Shrine World: The Adeptus Ministorum's most sacred worlds produce the most convicted of Sisterhoods, and that is no small feat.",
            "Feudal World: Humble followers of Him on Terra, these women of the cloth live simple lives but can be stubborn and fanatical should The Emperor will them to war.",
            "Feral World: These women have always had nothing but their wits and faith in the Emperor, teach them how to operate a Flamer and watch their holy fury be unleashed.",
            "Death World: What Feral Worlders and Underhivers would call the stuff of mind breaking nightmares, these women consider lunch.",
            "Fleet-based(Imagine hosting these evangelicals!): The Crusade never ends, wise is she who accepts that."
    );

    private final List<String> strategyOptions = Arrays.asList(
            "Close Combat/ Fireteams", "Ranged Combat", "Armoured Assault", "Stealth", "Lightning Strike", "Orbital Insertion",
            "Close Air Support", "Siege", "Shock and Awe", "Terror"
    );

    private final List<String> methodsOfWorshipOptions = Arrays.asList(
            "Honour to the Hero(ine)- \"Remember the saint and s/he shall guide you!\"",
            "The Emperor Above All - \"By the Light of Terra we know the Truth!\"",
            "Honour those Gone before - \"Look to your superiors for guidance, they shall not fail you\"",
            "Death Cult - \"We earn our place at the Emperor's table through death!\"",
            "Purity of Man - \"Protect the Hallowed human form from rusted iron\"",
            "Faith Over Steel - \"Let steadfast faith replace this corroded iron!\"",
            "Penance and Obligation - \"You owe a debt of blood to the Imperium\"",
            "Esoteric Beliefs - \"Outsiders cannot comprehend our faith\""
    );

    private final List<String> sizeOptions = Arrays.asList(
            "Endangered: Between a single Mission to an understrength Commandery in size",
            "Under powered: Between a full Commandery to an understrength Preceptory",
            "Normal: Numbers at or approaching that of a full Preceptory",
            "Ranks Completely Full: An unusually large Order Minoris exceeding a Preceptory in size"
    );

    private final List<String> alliesOptions = Arrays.asList(
            "Administratum", "Adeptus Arbites", "Another Order(choose one)", "Adeptus Astra Telepathica", "Adeptus Mechanicus",
            "Adeptus Astartes Chapter", "Adeptus Titanicus", "Astropaths", "Chartist Captains", "Ecclesiarchy", "Imperial Guard from a specific world",
            "Imperial Navy", "Inquisition", "Navigators", "Officio Assassinorum", "Planetary Defence Force of a specific world",
            "A Rogue Trader dynasty", "Schola Progenium", "Scholastica Psykana "
    );

    private final List<String> enemiesOptions = Arrays.asList(
            "Roll on Order Friends table", "The Orks (alternatively, you may select a particular Waaagh! or Warboss)",
            "The Eldar (alternatively, you may select a particular Craftworld or leader)",
            "The Tyranids (alternatively, you may select a particular Hive Fleet)",
            "Chaos Space Marines (you should choose a particular warband, Chapter, or Traitor Legion)",
            "A particular Daemon, Daemon Prince or Disciple of Chaos",
            "A particular Chaos-aligned group (i.e., Traitor Titan Legion, Chaos pirates, renegade Imperial Guard, etc.)",
            "The Dark Eldar (alternatively, you may select a particular Kabal or leader)",
            "Other (choose one force or group, such as aliens (see below) or heretics or a specific cult)"
    );

    public OrderService(OrderRepository orderRepository) {this.orderRepository = orderRepository;}

    public String getRandomOriginator() {
        int roll = random.nextInt(10);

        if (roll < 2) {
            return originatorOptions.get(0);
        }
        else if (roll < 4) {
            return originatorOptions.get(1);
        }
        else if (roll < 6) {
            return originatorOptions.get(2);
        }
        else if (roll < 8) {
            return originatorOptions.get(3);
        }
        else if (roll < 9) {
            return originatorOptions.get(4);
        }
        else {
            return originatorOptions.get(5);
        }
    }

    public String getRandomFounding() {
        int roll = random.nextInt(10);

        if (roll < 2) {
            return foundingOptions.get(0);
        }
        else {
            return foundingOptions.get(roll);
        }
    }

    public String getRandomFlaw() {
        int roll = random.nextInt(5);

        return flawOptions.get(roll);
    }

    public String getRandomDemeanour() {
        int roll = random.nextInt(10);

        return demeanourOptions.get(roll);
    }

    public String getRandomPrimarySaint() {
        int roll = random.nextInt(100);

        if (roll < 20) {
            return primarySaintOptions.get(0);
        }
        else if (roll < 50) {
            return primarySaintOptions.get(1);
        }
        else if (roll < 60) {
            return primarySaintOptions.get(2);
        }
        else if (roll < 70) {
            return primarySaintOptions.get(3);
        }
        else if (roll < 80) {
            return primarySaintOptions.get(4);
        }
        else if (roll < 90) {
            return primarySaintOptions.get(5);
        }
        else if (roll < 99) {
            return primarySaintOptions.get(6);
        }
        else {
            return primarySaintOptions.get(7);
        }
    }

    public String getRandomDeeds() {
        int roll = random.nextInt(20);

        if (roll < 5) {
            return saintDeedOptions.get(0);
        }
        else if (roll < 10) {
            return saintDeedOptions.get(1);
        }
        else if (roll < 14) {
            return saintDeedOptions.get(2);
        }
        else if (roll < 17) {
            return saintDeedOptions.get(3);
        }
        else {
            return saintDeedOptions.get(4);
        }

    }

    public String getRandomHomeworld() {
        int roll = random.nextInt(100);

        if (roll < 21) {
            return homeworldOptions.get(0);
        }
        else if (roll < 46) {
            return homeworldOptions.get(1);
        }
        else if (roll < 71) {
            return homeworldOptions.get(2);
        }
        else if (roll < 83) {
            return homeworldOptions.get(3);
        }
        else if (roll < 95) {
            return homeworldOptions.get(4);
        }
        else if (roll < 99) {
            return homeworldOptions.get(5);
        }
        else {
            return homeworldOptions.get(6);
        }
    }

    public String getRandomStrategy() {
        return strategyOptions.get(random.nextInt(10));
    }

    public String getRandomMethods() {
        return methodsOfWorshipOptions.get(random.nextInt(8));
    }

    public String getRandomSize() {
        int roll = random.nextInt(10);

        if (roll < 1) {
            return sizeOptions.get(0);
        }
        else if (roll < 4) {
            return sizeOptions.get(1);
        }
        else if (roll < 9) {
            return sizeOptions.get(2);
        }
        else {
            return sizeOptions.get(3);
        }
    }

    public String getRandomAllies() {
        int roll = random.nextInt(100);

        if (roll < 5) {
            return alliesOptions.get(0);
        }
        else if (roll < 15) {
            return alliesOptions.get(1);
        }
        else if (roll < 30) {
            return alliesOptions.get(2);
        }
        else if (roll < 35) {
            return alliesOptions.get(3);
        }
        else if (roll < 45) {
            return alliesOptions.get(4);
        }
        else if (roll < 50) {
            return alliesOptions.get(5);
        }
        else if (roll < 55) {
            return alliesOptions.get(6);
        }
        else if (roll < 58) {
            return alliesOptions.get(7);
        }
        else if (roll < 60) {
            return alliesOptions.get(8);
        }
        else if (roll < 65) {
            return alliesOptions.get(9);
        }
        else if (roll < 75) {
            return alliesOptions.get(10);
        }
        else if (roll < 79) {
            return alliesOptions.get(11);
        }
        else if (roll < 85) {
            return alliesOptions.get(12);
        }
        else if (roll < 88) {
            return alliesOptions.get(13);
        }
        else if (roll < 91) {
            return alliesOptions.get(14);
        }
        else if (roll < 93) {
            return alliesOptions.get(15);
        }
        else if (roll < 98) {
            return alliesOptions.get(16);
        }
        else if (roll < 99) {
            return alliesOptions.get(17);
        }
        else {
            return alliesOptions.get(18);
        }
    }

    public String getRandomEnemies() {
        int roll = random.nextInt(100);

        if (roll < 2) {
            return enemiesOptions.get(0);
        }
        else if (roll < 31) {
            return enemiesOptions.get(1);
        }
        else if (roll < 42) {
            return enemiesOptions.get(2);
        }
        else if (roll < 51) {
            return enemiesOptions.get(3);
        }
        else if (roll < 68) {
            return enemiesOptions.get(4);
        }
        else if (roll < 79) {
            return enemiesOptions.get(5);
        }
        else if (roll < 87) {
            return enemiesOptions.get(6);
        }
        else if (roll < 97) {
            return enemiesOptions.get(7);
        }
        else {
            return enemiesOptions.get(8);
        }
    }
}
