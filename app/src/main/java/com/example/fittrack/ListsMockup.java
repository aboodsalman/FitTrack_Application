package com.example.fittrack;

import android.widget.Toast;

import java.util.ArrayList;

public class ListsMockup {
    private static ArrayList<Plan> plans;
    private static ArrayList<String> quotes;
    private static ArrayList<Recommendation> recommendations;

    public ListsMockup(){
        plans=new ArrayList<Plan>();
        plans.add(new Plan("Cardio Blast", "High-intensity cardio workout with exercises like jumping jacks, burpees, and mountain climbers to boost heart rate and improve cardiovascular endurance.", R.drawable.exercise, 25, new Exercise[]{
                new Exercise("High Knees", "1 minute", "https://www.youtube.com/watch?v=FvjmPRU3zn4"),
                new Exercise("Burpees", "1 minute", "https://www.youtube.com/watch?v=TU8QYVW0gDU"),
                new Exercise("Jump Rope", "2 minutes", "https://www.youtube.com/watch?v=Mj6NezKTLmw"),
                new Exercise("Mountain Climbers", "30 seconds", "https://www.youtube.com/watch?v=kLh-uczlPLg")
        }));

        plans.add(new Plan("Strength Training", "Strength training workout focusing on building muscle with exercises like squats, bench press, and deadlifts.", R.drawable.strength, 30, new Exercise[]{
                new Exercise("Squats with Dumbbells", "2 minutes", "https://www.youtube.com/watch?v=vBA3vyOxJv0"),
                new Exercise("Dumbbell Bench Press", "2 minutes", "https://www.youtube.com/watch?v=VmB1G1K7v94"),
                new Exercise("Lunges with Weights", "2 minutes per leg", "https://youtube.com/watch?v=QOVaHwm-Q6U"),
                new Exercise("Deadlifts", "2 minutes", "https://www.youtube.com/watch?v=ytGaGIn3SjE")
        }));

        plans.add(new Plan("Sweat", "Full-body workout with bodyweight exercises to boost endurance, strength, and flexibility.", R.drawable.sweating, 20, new Exercise[]{
                new Exercise("Jumping Jacks", "1 minute", "https://www.youtube.com/watch?v=c4DAnQ6DtF8"),
                new Exercise("Bodyweight Squats", "1 minute", "https://www.youtube.com/watch?v=aclHkVaku9U"),
                new Exercise("Push-Ups", "1 minute", "https://www.youtube.com/watch?v=IODxDxX7oi4"),
                new Exercise("Plank with Shoulder Taps", "30 seconds", "https://www.youtube.com/watch?v=jgQ49dXfznk")
        }));

        plans.add(new Plan("Curls n’ Crunches", "Focuses on arm and core strength with bicep curls, hammer curls, and crunches.", R.drawable.muscle, 20, new Exercise[]{
                new Exercise("Bicep Curls", "1 minute", "https://www.youtube.com/watch?v=ykJmrZ5v0Oo"),
                new Exercise("Hammer Curls", "1 minute", "https://www.youtube.com/watch?v=zC3nLlEvin4"),
                new Exercise("Bicycle Crunches", "1 minute", "https://www.youtube.com/watch?v=9FGilxCbdz8"),
                new Exercise("Russian Twists", "1 minute", "https://www.youtube.com/watch?v=wkD8rjkodUI")
        }));

        plans.add(new Plan("Fab & Fit & Fun", "Fun and engaging workout with exercises for lower body, core, and cardiovascular fitness.", R.drawable.treadmill, 25, new Exercise[]{
                new Exercise("Bodyweight Lunges", "2 minutes per leg", "https://www.youtube.com/watch?v=QOVaHwm-Q6U"),
                new Exercise("Jump Squats", "2 minutes", "https://www.youtube.com/watch?v=U4s4mEQ5VqU"),
                new Exercise("Plank Jacks", "1 minute", "https://www.youtube.com/watch?v=xcBz0TtHqWI"),
                new Exercise("Standing Oblique Crunches", "1 minute per side", "https://www.youtube.com/watch?v=wD2GY3fUJqQ")
        }));

        plans.add(new Plan("Walk this Weigh", "Low-impact walking workout to improve cardiovascular health and endurance.", R.drawable.footprint, 35, new Exercise[]{
                new Exercise("Brisk Walk (Warm-Up)", "10 minutes", "https://www.youtube.com/watch?v=jUiI5DlRmO4"),
                new Exercise("Hill Walk or Incline Walk", "10 minutes", "https://www.youtube.com/watch?v=8jyUCvY0Q08"),
                new Exercise("Side Steps (in Place)", "5 minutes", "https://www.youtube.com/watch?v=X0jsl2ZrXug"),
                new Exercise("Walking Lunges", "10 minutes", "https://www.youtube.com/watch?v=R_4-f8xA9mk")
        }));

        plans.add(new Plan("Wishful Shrinking", "Combination of high-intensity exercises for fat loss and muscle toning.", R.drawable.pain, 30, new Exercise[]{
                new Exercise("Jump Rope", "2 minutes", "https://www.youtube.com/watch?v=Bm56LgM2rVw"),
                new Exercise("Squat to Press (using weights)", "2 minutes", "https://www.youtube.com/watch?v=p-WEM89E5Jc"),
                new Exercise("Kettlebell Swings", "2 minutes", "https://www.youtube.com/watch?v=1cVT3ee9mgU"),
                new Exercise("Box Jumps", "2 minutes", "https://www.youtube.com/watch?v=NBY9-kTuHEk")
        }));

        plans.add(new Plan("Move it Shake it Lift it", "Dance cardio and strength workout for full-body conditioning.", R.drawable.kettlebell, 30, new Exercise[]{
                new Exercise("Dance Cardio", "3 minutes", "https://www.youtube.com/watch?v=v3SGmJPDNVw"),
                new Exercise("Curtsy Lunges", "2 min/side", "https://www.youtube.com/watch?v=cVYnf2CFO9M"),
                new Exercise("Shoulder Press with Dumbbells", "2 minutes", "https://www.youtube.com/watch?v=HzIiNhHhhtA"),
                new Exercise("Side Crunches", "1 minute", "https://www.youtube.com/watch?v=q0QyCrpiNgI")
        }));

        plans.add(new Plan("F-abs Fridays", "Ab-focused workout to tone and strengthen your core.", R.drawable.back, 25, new Exercise[]{
                new Exercise("Crunches", "1 minute", "https://www.youtube.com/watch?v=0t4t3IpiEao"),
                new Exercise("Leg Raises", "1 minute", "https://www.youtube.com/watch?v=PCDxgsX_LFs"),
                new Exercise("Heel Taps", "1 minute", "https://www.youtube.com/watch?v=w2Um9ULrcBI"),
                new Exercise("Plank", "1 minute", "https://www.youtube.com/watch?v=pvIjsG5Svck")
        }));

        plans.add(new Plan("Sanity Session", "Yoga-inspired workout for flexibility, mobility, and mental relaxation.", R.drawable.healthcare, 30, new Exercise[]{
                new Exercise("Downward Dog to Plank Flow", "1 minute", "https://www.youtube.com/watch?v=T9R56KQ4PdA"),
                new Exercise("Standing Forward Bend", "1 minute", "https://www.youtube.com/watch?v=WklJNYaayP8"),
                new Exercise("Seated Twist (both sides)", "1 min/each", "https://www.youtube.com/watch?v=qEVNj4tcr0Y"),
                new Exercise("Child's Pose", "1 minute", "https://www.youtube.com/watch?v=nMp3MlTz9fA")
        }));

        plans.add(new Plan("Werk It!", "High-intensity training to build strength, endurance, and explosive power.", R.drawable.sport, 30, new Exercise[]{
                new Exercise("Box Jumps", "2 minutes", "https://www.youtube.com/watch?v=NBY9-kTuHEk"),
                new Exercise("Weighted Squat Press", "2 minutes", "https://www.youtube.com/watch?v=y29Cs067sD8"),
                new Exercise("Burpees with Push-Up", "2 minutes", "https://www.youtube.com/watch?v=Qe9aeEfgQTM"),
                new Exercise("High Knees", "1 minute", "https://www.youtube.com/watch?v=ZNDHivUg7vA")
        }));

        plans.add(new Plan("Transform", "Challenging workout that combines bodyweight and strength training for overall fitness.", R.drawable.workout, 30, new Exercise[]{
                new Exercise("Jump Lunges", "2 minutes", "https://www.youtube.com/watch?v=0lxr_mvYQeQ"),
                new Exercise("Push-Ups", "1 minute", "https://www.youtube.com/watch?v=_l3ySVKYVJ8"),
                new Exercise("Russian Twists", "1 minute", "https://www.youtube.com/watch?v=Yg47UxxV9Vc"),
                new Exercise("Mountain Climbers", "1 minute", "https://www.youtube.com/watch?v=kLh-uczlPLg")
        }));

        plans.add(new Plan("Sweat Fest", "Intense workout to burn fat and improve conditioning with a variety of exercises.", R.drawable.fitness2, 30, new Exercise[]{
                new Exercise("High Knees", "1 minute", "https://www.youtube.com/watch?v=kLh-uczlPLg"),
                new Exercise("Kettlebell Swings", "2 minutes", "https://www.youtube.com/watch?v=Qe9aeEfgQTM"),
                new Exercise("Burpees", "1 minute", "https://www.youtube.com/watch?v=X0jsl2ZrXug"),
                new Exercise("Side-to-Side Shuffles", "1 minute", "https://www.youtube.com/watch?v=HzIiNhHhhtA")
        }));

        plans.add(new Plan("Fierce", "Strength training and cardio to build muscle and endurance, featuring weighted exercises.", R.drawable.rope, 30, new Exercise[]{
                new Exercise("Weighted Deadlifts", "2 minutes", "https://www.youtube.com/watch?v=HzIiNhHhhtA"),
                new Exercise("Battle Ropes", "1 minute", "https://www.youtube.com/watch?v=kLh-uczlPLg"),
                new Exercise("Pull-Ups", "1 minute", "https://www.youtube.com/watch?v=Qe9aeEfgQTM"),
                new Exercise("Weighted Lunges", "2 min/leg", "https://www.youtube.com/watch?v=R_4-f8xA9mk")
        }));

        plans.add(new Plan("Power Up", "Strength-focused workout with heavy lifting and explosive movements to increase power.", R.drawable.protest, 30, new Exercise[]{
                new Exercise("Power Cleans", "2 minutes", "https://www.youtube.com/watch?v=HzIiNhHhhtA"),
                new Exercise("Weighted Squats", "2 minutes", "https://www.youtube.com/watch?v=PCDxgsX_LFs"),
                new Exercise("Overhead Press", "2 minutes", "https://www.youtube.com/watch?v=kLh-uczlPLg"),
                new Exercise("Farmers Carry", "1 minute", "https://www.youtube.com/watch?v=FvjmPRU3zn4")
        }));

        quotes = new ArrayList<>();
        quotes.add("Stay hydrated! Drink at least 8 glasses of water a day.");
        quotes.add("Push yourself because no one else is going to do it for you.");
        quotes.add("Take care of your body; it's the only place you have to live.");
        quotes.add("The pain you feel today will be the strength you feel tomorrow.");
        quotes.add("The only bad workout is the one you didn't do.");
        quotes.add("Fitness is like a relationship. You can’t cheat and expect it to work.");
        quotes.add("Don’t stop when you’re tired. Stop when you’re done.");

        recommendations = new ArrayList<>();
        recommendations.add(new Recommendation("BMI < 18.5", new String[]{
                "Strength Training", "Curls n’ Crunches", "Cardio Blast"
        }, new String[]{
                "Increase calorie intake: Focus on nutrient-dense, high-calorie foods.",
                "Protein-rich foods: Eggs, chicken, turkey, tofu, legumes, fish, and dairy.",
                "Healthy fats: Avocado, nuts, seeds, olive oil, and fatty fish.",
                "Complex carbohydrates: Brown rice, quinoa, whole-wheat bread and oatmeal."
        }));

        recommendations.add(new Recommendation("BMI 18.5 - 24.9", new String[]{
                "Strength Training", "Cardio Blast", "Move it Shake it Lift it"
        }, new String[]{
                "Balanced diet: Focus on lean proteins, healthy fats, and complex carbs.",
                "Hydrate properly: Drink plenty of water throughout the day.",
                "Eat a variety of fruits and vegetables for essential vitamins and minerals.",
                "Monitor portion sizes: Avoid overeating even if you feel you can eat more."
        }));

        recommendations.add(new Recommendation("BMI 25 - 29.9", new String[]{
                "Sweat", "Curls n’ Crunches", "Power Up"
        }, new String[]{
                "Calorie deficit: Aim to burn more calories than consumed.",
                "Lean protein sources: Chicken, turkey, tofu, and fish.",
                "Limit refined sugars: Reduce intake of processed sugars and sugary drinks.",
                "Increase fiber: Whole grains, legumes, vegetables, and fruits."
        }));

        recommendations.add(new Recommendation("BMI 30 - 34.9", new String[]{
                "Sweat", "Strength Training", "Wishful Shrinking"
        }, new String[]{
                "Focus on portion control: Eat smaller meals more frequently.",
                "Exercise regularly: Aim for at least 30 minutes of moderate exercise daily.",
                "Limit processed foods: Avoid fast food and junk food.",
                "Healthy fats: Incorporate avocados, nuts, seeds, and olive oil."
        }));

        recommendations.add(new Recommendation("BMI 35 and above", new String[]{
                "Sweat Fest", "Sanity Session", "F-abs Fridays"
        }, new String[]{
                "Create a calorie deficit: Focus on reducing daily calorie intake.",
                "Monitor macronutrients: Ensure you have a good balance of protein, fats, and carbs.",
                "Engage in low-impact cardio: Walking, swimming, cycling.",
                "Prioritize sleep: Ensure you're getting enough rest to aid weight loss."
        }));


    }

    public static ArrayList<Plan> getPlans(){
        return plans;
    }
    public String[] getTypes(){
        String[] types={"Workout Plans", "Nutrition Log"};
        return types;
    }
    public static ArrayList<String> getQuotes(){
        return quotes;
    }
    public static ArrayList<Recommendation> getRecommendations(){
        return recommendations;
    }
    public static Recommendation getRecomByType(String type){
        for(int i=0; i<recommendations.size(); i++){
            if(recommendations.get(i).getName().equals(type))
                return recommendations.get(i);
        }
        return null;
    }

    public static Plan getPlanByName(String name){
        for(int i=0; i<plans.size(); i++){
            if(plans.get(i).getName().equals(name))
                return plans.get(i);
        }
        return null;
    }
}
