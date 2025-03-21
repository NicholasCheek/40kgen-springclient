package com.fordytoo._kgen.Services;

import com.fordytoo._kgen.Repositories.RegimentRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
public class RegimentService {
    private final RegimentRepository regimentRepository;
    private final Random rand = new Random();

    private final List<String> classificationOptions = Arrays.asList(
            "Imperial Guard: A true regiment, drilled and competent in their service",
            "Planetary Defence Force: What the Guard doesn't want, the PDF will take. Expect them to be killed to a man in their first engagement.",
            "Penal Legion: Scum, criminals, murderers. Watch them closely, lest they decide to shank you and make a break for it.",
            "Militia: Brave enough to defend their world without training or equipment.",
            "Navy Armsmen: Experts in void-combat, they'll defend the ship or take the enemy's. "
    );

    private final List<String> recruitmentCriteriaOptions = Arrays.asList(
            "Volunteers: Only the brave and desperate (of both of which there are plenty) join this Regiment.",
            "Veterans: Taken from the \"best\" of the PDF and bolstered by experienced troops from other Regiments, this Regiment knows a little more about battle than most.",
            "Caste-born: Raised from birth as the warrior caste of their society, these soldiers make up in training and pedigree what they lack in experience.",
            "Nobility: Bought their commission for honor and glory",
            "Priesthood: This Regiment is comprised of those who venerate the God-Emperor in his soldier aspect.",
            "Abhumans: Ratlings, Ogryn, and other such useful creatures.",
            "Tribespeople: All you have to do is teach them which way the gun points, for living in an area with lesser technology produces hard soldiers.",
            "Lottery: Selection by the God-Emperor's grace, and a little luck.",
            "Spacers: Born on asteroids, off-world hab-stations, or the vessels of the Imperial Navy.",
            "Firstborn: Chosen by right of being the eldest child.",
            "Vat-grown: No families to complain, no friends to consider.",
            "Gangers: They fought each other in the slums, now they fight a true enemy.",
            "Convicts: Even the scum of the Emperor's domains may find purpose serving their sentence on the front lines.",
            "Non-Standard: This Regiment recruits from multiple groups. Roll 1d3 times on this chart."
    );

    private final List<String> natureOfRecruitmentOptions = Arrays.asList(
            "Punishment/Redemption: Recruits are gathered from the dregs of society, or as a punishment for past sins.",
            "Elite tithe: The best of the best of the planet were recruited for this regiment.",
            "Standard conscription: Average or above-average citizens recruited from all levels of society"
    );

    private final List<String> homeworldOptions = Arrays.asList(
            "Hive World: No claustrophobia, excellent sense of direction? Urban combat!",
            "Death World: For these people, life was a war before they could speak.",
            "Feral World: They fight like wild animals in the Skyfather's name.",
            "Agri-World: Sturdy, hard-working types, glad to be off the farm.",
            "Civilized World: Comfortable but not soft, ready to fight to preserve and spread civilization.",
            "Mining World: At home using Heavy Machinery, not afraid of the dark and great in tight spaces.",
            "Feudal World: Hard workers and steadfast warriors once they're convinced Lasguns aren't witchcraft.",
            "Shrine World: They charge into battle eagerly, and their very prayers are warcries.",
            "Forge World: Blessed by the Omnissiah to carry His light across the Galaxy.",
            "Lost Homeworld: Ghosts do not fear death, but they seek life with a terrible fury. (Roll again to determine what kind of world it was, before its loss.)",
            "Pleasure World: Soft as clay before the firing of the kiln; war is their crucible. Likely sponsored by wealthy nobles using the planet."
    );

    private final List<String> coreUnitsOptions = Arrays.asList(
            "Infantry Regiment: Large groups of on-foot infantry of all stripes comprise the core of this Regiment's forces. Who needs vehicles when you've enough bodies to drown the enemy? Can also be referred to as Line Infantry or Medium Infantry.",
            "Cavalry: Rough riders and mounted infantry, specialising in scouting and hit-and-run tactics. May or may not ride actual horses, with some regiments preferring cyborg mounts, mutants, or fuckoff-huge reptiles.",
            "Light Infantry: Infantry specializing in scouting, skirmishing, and scouting. Intended to soften up the enemy for the heavier troops.",
            "Heavy Infantry: Frontal assault troops and the defensive center of their Regiment's on-foot battle line.",
            "Mechanized Infantry: IFVs and APCs comprise the core of this regiment, ferrying teams of soldiers across rough terrain and into the heart of the battle.",
            "Drop: A bunch of adrenaline-hungry madmen who specialise in jumping out of perfectly good air transports to rapidly fall into the heart of the fight.",
            "Armored: Tanks for the memories! From Leman Russes to the rare Baneblade, the Regiment makes heavy use of tanks in their assaults.",
            "Artillery: Big guns never tire, and nor does the Regiment. Bring some earmuffs and hope the gunfire doesn't blow you off your feet.",
            "Siege: Specialising in blasting enemy fortifications into burning rubble and breaking through the breaches left by gunfire. Tenacious, patient, and with a penchant for heavy tanks and even heavier guns.",
            "Shock Troopers: Charged with leading assaults and penetrating into enemy lines, these troops are well-trained and equipped. A pity that they're so casualty-prone...",
            "Abhuman: Ogryns, Ratlings, and every other strain of semi-human that the Administratum can be bothered to sanction. (Can be taken automatically if recruiting from Abhumans)."
    );

    private final List<String> specializationOptions = Arrays.asList(
            "Drill & Discipline: Well-organised and practiced, this Regiment enforces strict discipline and training on its members, making them unlikely to run or panic in the middle of fierce battles.",
            "Counter: Trained and organised to fight a specific foe. They're good at breaking them over their knee, but tend to struggle, or rather show aggressive mediocrity, against other foes until they get more general experience.",
            "Stealth Warfare: They're spooky, they're sneeky, and while they may not be beakie, they do specialise in fucking your shit up without ever being seen.",
            "Lightning Strike: They specialise in hitting their enemies hard and fast, decimating the foe before they have any opportunity to react.",
            "Trench Warfare: The Death Korps of Krieg, though hopefully somewhat less suicidal.",
            "Close Combat: Rip and Tear incarnate; they love fixing bayonets and introducing the pointy end to the enemy's asshole",
            "Ranged Combat: Who needs bayonets when you can turn night into day through sheer volume of lasgun shots?",
            "Shock & Awe: Specialises in breaking enemy morale and putting the fear of the Emperor's legions in their foes.",
            "Guerrilla Warfare: Ambushing, traps, and tying up enemy units are their speciality. Think Rambo, except there's an entire regiment of him.",
            "Hive and Urban Warfare: Specialises in fighting in the cramped urban conditions of cities and hives."
    );

    private final List<String> loyaltyRatingOptions = Arrays.asList(
            "Overzealous: Need to be actively held back from giving their lives for the Emperor or from going too far when infrastructure and manpower must be preserved after an insurrection.",
            "Fanatical: No remorse, no retreat, no fear. They would sooner die to the last than do anything to shame the Emperor.",
            "Adherent: Hold fast to the Creed and His will. About the standard for most regiments.",
            "Undisciplined: Will follow the Emperor but don't expect them to bow to authority figures.",
            "Unorthodox: Serve the Emperor in ways frowned upon by most in the Administratum/Ministorum. This can vary from worshipping the Emperor in an unusual fashion (e.x.: as the Omnissiah), or the regiment adopting unusual tactics.",
            "Heretical: This regiment has abandoned the truth of the Emperor, and their fellows from the same planet will despise them for the black mark of shame. May be wholesale heretics, or merely self-interested renegades."
    );

    private final List<String> specialEquipmentOptions = Arrays.asList(
            "Traditional Weapons: This regiment has access to various traditional weapons, such as axes, spears, and swords for close combat. Your choice as to whether they're power weapons or not.",
            "War Trophies: This regiment loves to take trophies from their defeated opponents - while these are often ceremonial, such as polished fragments of armor or bits of skeleton, others include functioning weapons and esoteric devices.",
            "Specialized Lasgun Pattern: This regiment uses a lasgun pattern that has been modified for some specific purpose, like sniping or anti-armor work. This usually comes with a drawback of some kind, like being much more unstable or having less shots.",
            "Exotic Mounts: The regiment uses unorthodox mounts for transport, such as massive lizards, immense worms, or tamed mutant wildlife.",
            "Rare Heavy Weapon: The regiment has access to some rare weapon that the rest of the Guard lacks, like heavy plasma cannons or more esoteric devices such as grav-guns.",
            "Blessed Wargear: The regiment's wargear - from their superheavies' guns to the infantry's lasguns - is specially sanctified by Ecclesiarchy priests, granting it an impressive degree of efficacy against unclean targets.",
            "Augmented Troops: The flesh is weak! Augmetics ranging from super-strong mechanical limbs to biological cortex and reaction boosters are standard-issue among this regiment's troops, and even moreso among its officers.",
            "Special Vehicle: This regiment has a singularly rare or unusual vehicle (perhaps a pattern, perhaps only one) in its arsenal, such as a customised Baneblade or a Leviathan.",
            "Preferred Fighting Style: This regiment has a distinctive method of waging war that they prefer above all else.",
            "Well-Equipped: Roll an additional 1d100 for a second piece of special equipment, re-rolling any duplicate results."
    );

    private final List<String> creedOptions = Arrays.asList(
            "For The Homeworld: This regiment's mission is to demonstrate the skill and steel of the homeworld to the rest of the Imperium.",
            "For the Emperor: Fervent belief in the Imperial cult and the righteous mission of the Imperium fuels this regiment.",
            "Best of the Best: The regiment believes itself to be elite and constantly strives to prove itself.",
            "Glory In Death: The regiment's mission is to die, and take as many enemies with it as possible.",
            "We Must Repent: The regiment believes it is on a mission to pay for their homeworld's sins with blood.",
            "Tribal Faiths: This regiment is beholden to primitive beliefs. If from a civilized world, clannish practices from hive gang cultures or other such traditions predominate.",
            "Steel Over Flesh: This regiment believes the way to victory is through machine augmentation. May be taken automatically if originating from a Forge World or possessing the Augmented Troops Special Equipment.",
            "Esoteric Beliefs: Really weird, possibly heretical shit."
    );

    private final List<String> friendsOptions = Arrays.asList(
            "Administratum", "Adeptus Arbites", "Adeptus Astartes (a specific chapter)", "Scholastica Psykana",
            "Adeptus Mechanicus", "Adepta Sororitas (a specific order)", "Adeptus Titanicus", "Ecclesiarchy",
            "Imperial Guard (of a specific world)", "Imperial Navy", "Inquisition", "Navis Nobilite (Navigators, of a specific house)",
            "Officio Assassinorum", "PDF (of a specific world)", "Rogue Trader Dynasty", "Adeptus Custodes",
            "Schola Progenium", "League of Blackships"
    );

    private final List<String> enemiesOptions = Arrays.asList(
            "Roll on the \"Regiment Friends\" table.", "Orks", "Eldar", "Tyranids",
            "Chaos Space Marines", "Daemon Prince/Daemon/other specific disciple of Chaos",
            "Specific Chaos-aligned group", "Dark Eldar", "Tau", "Necrons", "Other Xenos"
    );

    public RegimentService(RegimentRepository regimentRepository) {
        this.regimentRepository = regimentRepository;
    }

    public String getRandomClassification() {
        int roll = rand.nextInt(10);
        if (roll < 5) {
            return classificationOptions.get(0);
        }
        else if (roll < 6) {
            return classificationOptions.get(1);
        }
        else if (roll < 8) {
            return classificationOptions.get(2);
        }
        else if (roll < 9) {
            return classificationOptions.get(3);
        }
        else {
            return classificationOptions.get(4);
        }
    }
}
