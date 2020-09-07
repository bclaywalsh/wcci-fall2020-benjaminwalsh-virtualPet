package VirtualPetApplication;

import java.util.HashMap;

public class VirtualPet {
    public String species; //species: Hearth Kami, Curse Kami, Nature Kami, Dragon, Phoenix, Kirrin
    public String name = "Kynereg";
    public String goalName; //this Kami seeks to: maintain a pleasant and profitable household
    public String mood = "content"; //moods: (happy, content, bored) show an upwards or downwards trend in goalProgress. Random events may cause other moods:
    //other moods: (hungry, mischevious, struggling);

    public int lifeTime = 0; //adds to the difficulty of achieving goal progress and unlocks twists in your kamis progress
    public int boredom = 0; //adds to the difficulty of achieving goal progress and can cause the Kami to take random actions
    int capriciousness = 2; //a permanent stat that makes the Kami more difficult to manage.
    public int hunger = 0; //goes up each tick, and increases the difficulty of accomplishing anything
    public int loyalty = 2; //increases the ease of achieving goal progress
    public int discipline = 5;//increases the ease of achieving goal progress, and is necessary to unlock more powerful interractions
    public int intelligence = 2;// Scale of 0-10. Like discipline, but this number is required to accomplish other activities
    public int goalProgress = 2; //a score system. Low (goalProgress+loyalty) / (capriciousness+lifeTime*0.5+hunger) may subtract from quintessence. A high goal progress may add to it. Each tick, the key of the interaction menu acts as a percentage * 10 on a random roll for one more point of goal progress
    public int goalProgressLast = goalProgress;
    double randomProgress = (((double) goalProgress + (double) loyalty) * Math.random() * 2 / ((double) capriciousness + (double) lifeTime * 0.5 + (double) hunger));
    public int quintessence = 2; //the level of manifestation of the Kami. At 0 quintessence, it fades away. Once a Kami has a Quintessence equal to its Ascendancy it will ascend, and begin taking care of itself.
    public int quintessenceLast = quintessence;
    public int ascendancy = 10;
    public int randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));

    public int interactionOne = 4;
    public String interactionOneString;
    public int interactionTwo = 6;
    public String interactionTwoString;
    public int interactionThree = 8;
    public String interactionThreeString;
    public int interactionChoice = 0;
    int interactionChoiceDifficulty = 0;
    public int reaction = 0;
    public String reactionString;

    // interactions are the options you have when interacting with your Kami. Each interaction has a set of consequences associated with it, and a desired reacting that is rolled for randomly.
    public HashMap<Integer, String> interactions = new HashMap<Integer, String>();


    //accesors
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getGoalName() {
        return goalName;
    }

    public String getMood() {
        return mood;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getCapriciousness() {
        return capriciousness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getDiscipline() {
        return discipline;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getQuintessence() {
        return quintessence;
    }

    public int getAscendancy() {
        return ascendancy;
    }

    public int getGoalProgress() {
        return goalProgress;
    }

    public String getReactionString() {
        return reactionString;
    }

    public int getReaction() {
        return reaction;
    }



    public int getInteractionOne() {
        return interactionOne;
    }

    public int getInteractionTwo() {
        return interactionTwo;
    }

    public int getInteractionThree() {
        return interactionThree;
    }
    public String getInteractionOneString() {
        return interactionOneString;
    }

    public String getInteractionTwoString() {
        return interactionTwoString;
    }

    public String getInteractionThreeString() {
        return interactionThreeString;
    }


    //Constructor
    public VirtualPet(String species, String name) {
        name = this.name;
        species = this.species;
    }


    //Update Bio. This will initialize or change all of the pets attributes to better reflect its type.
    public void updateBio() {

        //HEARTH KAMI RECONSTRUCTION
        if ((species.equals("hearth")) || (species.equals("hearth kami"))) {
            species = "Hearth Kami";
            goalName = "maintain a happy and healthy home.";

            capriciousness = 3;
            lifeTime = 0;
            boredom = 0;
            hunger = 2;
            loyalty = 5;
            discipline = 5;
            intelligence = 3;
            goalProgress = 0;
            quintessence = 2;
            quintessenceLast = quintessence;
            reactionString = "is patiently awaiting instructions,";
            mood = "hopeful.";
            ascendancy = 10;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Urge Kynereg to help a child learn.");
            interactions.put(9, "Help Kynereg to reward a good child.");
            interactions.put(8, "Encourage Kynereg to help increase the household income.");
            interactions.put(7, "Instruct Kynereg to help with cleaning the house.");
            interactions.put(6, "Teach Kynereg some household rules.");
            interactions.put(5, "Offer up Kynereg an offering for all their hard work.");
            interactions.put(4, "Allow Kynereg to do as they please.");
            interactions.put(3, "Encourage Kynereg to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //NATURE KAMI RECONSTRUCTION
        if ((species.equals("nature")) || (species.equals("nature kami"))) {
            species = "Nature Kami";
            goalName = "maintain the natural order of the wilderness.";

            capriciousness = 4;
            lifeTime = 0;
            boredom = 3;
            hunger = 2;
            loyalty = 4;
            discipline = 0;
            intelligence = 2;
            goalProgress = 0;
            quintessence = 3;
            quintessenceLast = quintessence;
            reactionString = "is playing made-up games amidst the sun-dappled grasses,";
            mood = "exhuberant.";
            ascendancy = 12;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Work with Kynereg to become a spiritual warden of a protected wilderness.");
            interactions.put(9, "Work with Kynereg to establish a healthy local ecosystem.");
            interactions.put(8, "Rope off and bless a spirit tree in which Kynereg is to reside.");
            interactions.put(7, "Teach Kynereg about life and death, and the necessity of the hunt.");
            interactions.put(6, "Frolic and play with Kynereg amidst natural splendor.");
            interactions.put(5, "Offer up Kynereg an offering for all their hard work.");
            interactions.put(4, "Allow Kynereg to do as they please.");
            interactions.put(3, "Disparage Kynereg's commitment to their goal.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //CURSE KAMI RECONSTRUCTION
        if ((species.equals("curse")) || (species.equals("curse kami"))) {
            species = "Curse Kami";
            goalName = "spread the misery and anger with which they are infected.";

            capriciousness = 0;
            lifeTime = 0;
            boredom = 0;
            hunger = 6;
            loyalty = 0;
            discipline = 5;
            intelligence = 5;
            goalProgress = 3;
            quintessence = 2;
            quintessenceLast = quintessence;
            reactionString = "is watching you silently,";
            mood = "malevolent.";
            ascendancy = 10;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Perform a blasphemous and highly difficult rite of chaos to strengthen the bonds between Yomi-tsu-kuni and this world.");
            interactions.put(9, "Offer up an appropriate victim to Kynereg.");
            interactions.put(8, "Commune with Kynereg to strengthen your bonds.");
            interactions.put(7, "Tear down protective talismans to allow Kynereg free reign.");
            interactions.put(6, "Undermine the good works of others.");
            interactions.put(5, "Offer up Kynereg an offering for all their hard work.");
            interactions.put(4, "Spread gloom.");
            interactions.put(3, "Encourage Kynereg to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as curses, or Kami...right?");

        }

        //DRAGON RECONSTRUCTION
        if ((species.equals("dragon")) || (species.equals("ryu"))) {
            species = "Dragon";
            goalName = "rule over all it sees, and to profit in all ways.";

            capriciousness = 7;
            lifeTime = 0;
            boredom = 0;
            hunger = 2;
            loyalty = 0;
            discipline = 5;
            intelligence = 8;
            goalProgress = 0;
            quintessence = 7;
            quintessenceLast = quintessence;
            reactionString = "is paying rapt attention to you,";
            mood = "eager to dominate.";
            ascendancy = 20;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Bind local gods in agreements tying them inextricably to Kynereg.");
            interactions.put(9, "Use the gifts of Kynereg to build upon your mortal network to gain wealth and influence.");
            interactions.put(8, "Establish a shrine in which Kynereg is revered.");
            interactions.put(7, "Give a substantial gift to Kynereg as a token of your respect.");
            interactions.put(6, "Fight chaos wherever it is to be found.");
            interactions.put(5, "Offer up Kynereg an appeasement as a sign of utmost respect.");
            interactions.put(4, "Allow Kynereg to do as they please.");
            interactions.put(3, "Encourage Kynereg to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //KIRRIN RECONSTRUCTION
        if ((species.equals("kirrin")) || (species.equals("quilin"))) {
            species = "Kirrin";
            goalName = "witness and channel profound acts of destiny in this world.";

            capriciousness = 0;
            lifeTime = 0;
            boredom = 0;
            hunger = 3;
            loyalty = 3;
            discipline = 7;
            intelligence = 4;
            goalProgress = 0;
            quintessence = 1;
            quintessenceLast = quintessence;
            reactionString = "is watching the world closely,";
            mood = "calm.";
            ascendancy = 8;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Establish a sacred shrine to a greater deity, in which Kynereg acts as a messenger.");
            interactions.put(9, "Show Kynereg an act of great providence.");
            interactions.put(8, "Establish a network of lesser shrines to multiple deities, with the mark of Kynereg upon them.");
            interactions.put(7, "Share a powerful life lesson with Kynereg, learned from your own hard-earned experience.");
            interactions.put(6, "Teach Kynereg about the mortal realm.");
            interactions.put(5, "Offer up Kynereg an offering to strengthen their resolve.");
            interactions.put(4, "Allow Kynereg freedom to explore.");
            interactions.put(3, "Encourage Kynereg to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //PHOENIX RECONSTRUCTION
        if ((species.equals("phoenix")) || (species.equals("pheonix"))) {
            species = "Phoenix";
            goalName = "bless sacred beginnings and instill them with vitality.";

            capriciousness = 4;
            lifeTime = 0;
            boredom = 4;
            hunger = 4;
            loyalty = 1;
            discipline = 1;
            intelligence = 2;
            goalProgress = 5;
            quintessence = 5;
            quintessenceLast = quintessence;
            reactionString = "is pulling itself from a pile of ashes,";
            mood = "rejuvenated.";
            ascendancy = 20;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Construct an effigy of ancient deadwood around a blood sacrifice, and burn it at dusk.");
            interactions.put(9, "Plant or reap a harvest for Kynereg to bless.");
            interactions.put(8, "Compose a new piece of music.");
            interactions.put(7, "Work towards establishing a new venture.");
            interactions.put(6, "Build a comfy nest for Kynereg.");
            interactions.put(5, "Burn some incense for Kynereg.");
            interactions.put(4, "Allow Kynereg to do as they please.");
            interactions.put(3, "Encourage Kynereg to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }


    }

    //generate random interactions
    public void generateChoices() {
        //randomly generate 3 different numbers 1 through 10
        interactionOne = (int) Math.ceil(Math.random() * 10);
        do {
            interactionTwo = (int) Math.ceil(Math.random() * 10);
        } while (interactionTwo == interactionOne);
        do {
            interactionThree = (int) Math.ceil(Math.random() * 10);
        } while ((interactionThree == interactionOne) || (interactionThree == interactionTwo));

        interactionOneString = interactions.get(interactionOne);
        interactionTwoString = interactions.get(interactionTwo);
        interactionThreeString = interactions.get(interactionThree);
    }

    //update status
    public void tick(String command) {

        lifeTime++;
        hunger++;

        reaction = Integer.parseInt(command);
        if (reaction != interactionOne && reaction!= interactionTwo && reaction!= interactionThree) reaction = 11;


               //translate reaction back through interaction variables to match it to the correct interaction
        if (reaction == 1) {
            reaction = interactionOne;
        } else if (reaction == 2) {
            reaction = interactionTwo;
        } else if (reaction == 3) {
            reaction = interactionThree;
        }

        randomProgress = (Math.random() + 0.5) + 0.1 * ((double) goalProgress + (double) loyalty + (double) discipline - (double) lifeTime * 0.75 - (double) hunger - (double) boredom);
        //((double)goalProgress+((double)loyalty+(double)discipline)/2)*Math.random()*3 / ((double)capriciousness+(double)lifeTime*0.3+(double)hunger);

        //update mood
        if (hunger > 5) {
            mood = "hungry.";
        } else if (goalProgress < lifeTime*0.5) {
            mood = "tired...";
        } else if (boredom > 3) {
            mood = "bored.";
        } else if (goalProgress > goalProgressLast && quintessenceLast < quintessence) {
            mood = "ecstatic!";
        } else if (goalProgress > goalProgressLast) {
            mood = "happy.";
        }


        //check the loyalty of the kami against a random number 1 through 10, with an increased difficulty based on the index of the interaction
        if ((int) Math.ceil(Math.random() * 10) + randomProgress > reaction + getBoredom()) {
            reaction = Integer.parseInt(command);


            //create a random reaction with high boredom producing worse results
        } else {
            reaction = (int) Math.ceil(Math.random() * 10) - (int)Math.ceil(boredom) - 2;
        }

        //update goalProgress && quintessence
        System.out.println("randomProgress: " + randomProgress);
        if (randomProgress > 1) {
            goalProgress++;
            if (randomProgress > 1.2) {
                quintessence++;
            }
        } else if (randomProgress < 0.8) {
            if (Math.random() > randomProgress) quintessence--;

            //Kami Death
            if (quintessence < 1) {
                System.out.println("And sadly, Kynereg faded away, and was forgotten.");
                System.exit(0);
            }
        }

//!!! THE ALL IMPORTANT REACTIONS!!! ------------------------------------------------------------------------HEARTH KAMI
        if (getSpecies().equals("Hearth Kami")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "helping a child understand their homework,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "instilling a sense of pride in the children's accomplishments,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "bending their will towards helping the families wage earners,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "helping the Grime and Disorder Kami move out,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "shaping itself to fit the household rules, and engraving them into the memories of its inhabitants,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "working harder than ever,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "going about, instilling merry chaos into the families lives,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "grimly working hard to improve,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "wandering about looking for something to do,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "staring about hopelessly wondering if they even exist,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }

        //  -------------------------------------------------------------------------------NATURE KAMI
        if (getSpecies().equals("Nature Kami")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "shepherding the spirits of the fallen into reincarnation,";
                boredom-=2;
                hunger -= 3;
                intelligence++;
                loyalty ++;
            }
            if (reaction == 9) {
                reactionString = "playing amongst the pools and meadows of their healthy home,";
                loyalty++;
                boredom -= 5;
            }
            if (reaction == 8) {
                reactionString = "decorating their new home tree with all manner of blooms and funguses,";
                discipline++;
                intelligence++;
                loyalty++;
            }
            if (reaction == 7) {
                reactionString = "guiding the predators within their domain to hunt responsibly,";
                hunger-=3;
                boredom -= 2;
            }
            if (reaction == 6) {
                reactionString = "basking lazily in the sun while absorbing vitality,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "feasting on the attention of your offering,";
                loyalty++;
                hunger -= 2;
                boredom -= 1;
            }
            if (reaction == 4) {
                reactionString = "going about the wilderness, living its many many lives,";
                boredom -= 5;
                loyalty ++;
            }
            if (reaction == 3) {
                reactionString = "is pouting and patently ignoring you,";
                loyalty--;
            }
            if (reaction == 2) {
                reactionString = "quietly soaks into the landscape,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                    discipline--;
                } else {
                    boredom = 0;
                    discipline-=2;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "staring about hopelessly wondering if they even exist,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------CURSE KAMI
        if (getSpecies().equals("Curse Kami")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10  + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger  > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger  > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "drawing forth tormented souls from the underworld,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "is darkening the light within their victim,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "sharing their torment and rage, settling deeper into you,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "spreading itself into the once sanctified homes and shrines,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "spreading itself through the frustration of your adversaries,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "swelling with power,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "taking advantage of the passersby who tempt fate by daring to look into the darkness,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "eyeing you hungrily,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "consolidating their strength, producing strange groaning clicks in the night to frighten wrestless sleepers,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "grinning wickedly at you from beyond the shadows,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------DRAGON
        if (getSpecies().equals("Dragon")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom >  10) {
                    boredom -= 2;
                } else if (randomNumber1to10  + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger  > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger  > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "arranging the hierarchy of Kami within their court, doling out commands,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "spreading the bounds of their spiritual rule abroad into your conquests,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "admiring their depiction in the adequate shrine you have erected,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "basking lazily in the aftermath of a glorious feast,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "bringing order to the chaotic spiritual realm in the wake of your deeds,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "continuing to allow you to serve them, for now,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "waging reckless war in the spirit realm,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "considering you with narrowed gaze,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "settling in for a draconic nap,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "beginning to fall into a deep slumber,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------PHOENIX
        if (getSpecies().equals("Phoenix")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom  > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom  > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger  > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger  > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "spreading their wings over the glowing embers of the Effigy, basking in the warm glow";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "flashing through the sunbeams about your crop, raining down blessed sparks of vitality,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "trilling your tune more beautifully than you could have ever believed possible,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "establishing a spiritual roost near your venture,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "settling into the nest, crooning and squawking happily in a decidedly non-regal manner,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "inhaling the sacred smoke contentedly,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "flying about the land, spreading vitality,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "scoffing at your young impatience,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "going about the everyday business of spiritual life,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "looking at you dispassionately,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------KIRRIN
        if (getSpecies().equals("Kirrin")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom  > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom  > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger  > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "carrying out covert missions directly from the sacred realm,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "engraving a record of the destined event upon their scaly hide,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "standing in a cusp between its many shrines, looking out upon all for moments of providence,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "standing regally by your side to discern the depths of your wisdom,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "paying close attention to the comings and goings of mortals with ever improving comprehension,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "bounding ever surer from roof-top to roof-top and branch to branch,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "picking their way delicately between the spaces of human awareness, enacting the mysterious will of the beyond,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "giving you a blank look,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "roaming farther and farther from your side,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "seeming more and more insubstantial and unsure of their goal,";
                if (Math.random() < 0.4) { loyalty--;
                }
                if (Math.random() < 0.4) { discipline--;
                }
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //update last tick variables
        goalProgressLast = goalProgress;
        quintessenceLast = quintessence;

    }
}