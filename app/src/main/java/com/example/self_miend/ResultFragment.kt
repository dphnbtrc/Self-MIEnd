package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class ResultFragment : Fragment() {

    private val advicesListAnxiety = listOf(
        "Practice deep breathing exercises to calm your nervous system and reduce anxiety.",
        "Engage in regular physical activity as it helps in reducing stress and anxiety.",
        "Maintain a balanced diet and limit caffeine and sugar intake, as they can contribute to anxiety.",
        "Practice mindfulness techniques or meditation to ground yourself in the present moment and reduce anxiety.",
        "Ensure you get adequate sleep as lack of sleep can exacerbate anxiety.",
        "Identify and try to minimize exposure to situations or triggers that cause anxiety.",
        "Talk to someone you trust, a friend, family member, or therapist, about your feelings and worries.",
        "Break down tasks into manageable steps to reduce overwhelming feelings.",
        "Organize your time effectively to reduce stress caused by feeling rushed or overwhelmed.",
        "Reduce exposure to distressing news or social media if it tends to increase your anxiety."
    )

    private val advicesListDepression = listOf(
        "Seek support from a mental health professional such as a therapist, counselor, or psychiatrist. They can provide therapy, medication, or a combination of both tailored to your needs.",
        "Connect with friends, family, or support groups. Sharing your feelings and experiences with others can alleviate feelings of isolation and offer emotional support.",
        "Engage in regular physical activity as it helps in releasing endorphins, improving mood, and reducing symptoms of depression.",
        "Eat a well-balanced diet rich in fruits, vegetables, whole grains, and lean proteins. Certain nutrients can positively impact mood and energy levels.",
        "Maintain a regular sleep schedule and create a relaxing bedtime routine. Quality sleep is crucial for mental health.",
        "Practice mindfulness, meditation, or deep breathing exercises to reduce stress and promote relaxation.",
        "Make efforts to stay connected with others, even when you might feel like withdrawing. Social interaction is important for mental well-being.",
        "Break tasks into manageable steps and set achievable goals to avoid feeling overwhelmed by large tasks.",
        "Identify and minimize stress triggers. Use stress reduction techniques like yoga, journaling, or hobbies to cope with stress.",
        "Practice self-compassion and avoid self-criticism. Treat yourself with kindness and understanding, acknowledging that recovery from depression takes time."
    )

    private val advicesListInternetAddiction = listOf(
        "Set Boundaries: Establish specific times for using the internet and stick to them. Create a schedule to limit excessive usage.",
        "Recognize situations or emotions that lead to excessive internet use and find ways to address them differently.",
        "Remove or limit access to devices or apps that consume the most time and attention.",
        "Engage in hobbies, sports, or activities that don't involve screens to diversify your interests and reduce dependency on the internet.",
        "Be mindful of your online activities and take breaks to assess whether you're using the internet out of habit or necessity.",
        "Foster real-life connections by spending quality time with friends and family offline.",
        "Designate specific areas (like bedrooms or dining areas) as tech-free zones to encourage offline activities and interactions.",
        "Consider joining support groups or seeking professional help to manage and overcome internet addiction.",
        "Plan periodic breaks from the internet, whether it's a day or a weekend, to reset and recalibrate your relationship with technology.",
        "Regularly assess your internet usage patterns and their impact on your life. Adjust habits accordingly to maintain a healthy balance."
    )

    private val advicesListStress = listOf(
        "Deep Breathing and Relaxation Techniques: Practice deep breathing, meditation, or progressive muscle relaxation to calm your mind and body.",
        "Engage in physical activities like walking, yoga, or any exercise you enjoy to reduce stress hormones and boost endorphins.",
        "Maintain a balanced diet rich in fruits, vegetables, and whole grains to support your body's stress-coping mechanisms.",
        "Ensure you get enough quality sleep as it plays a vital role in managing stress levels.",
        "Organize tasks, prioritize, and set realistic goals to reduce overwhelming feelings caused by time constraints.",
        "Learn to say no when necessary and establish boundaries to manage your commitments and avoid overload.",
        "Talk to friends, family, or a professional counselor for emotional support and guidance when dealing with stress.",
        "Practice mindfulness or engage in activities like reading, listening to music, or hobbies to relax your mind.",
        "Schedule time for activities you enjoy or for self-care to recharge and alleviate stress.",
        "Focus on the positives, cultivate gratitude, and try to adopt a more optimistic perspective on challenging situations."
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val testResultScore : TextView = requireView().findViewById(R.id.testResultScore)
        val testResultLevel : TextView = requireView().findViewById(R.id.testResultSeverity)

        //Anxiety Test
        val comingFromAnxietyTest = arguments?.getBoolean("comingFromAnxietyTest", false)

        val scoreResultAnxiety = arguments?.getInt("AnxietyScore", 0) ?: 0
        testResultScore.text = "$scoreResultAnxiety"

        if (comingFromAnxietyTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesAnxietyIndex = (advicesListAnxiety.indices).random()
            val randomAdvicesAnxiety = advicesListAnxiety[randomAdvicesAnxietyIndex]

            tipsOrQuotesOrAdvice.text = randomAdvicesAnxiety

            when (scoreResultAnxiety) {
                in 0..4 -> {
                    testResultLevel.text = getString(R.string.anxietyR1)
                }
                in 5..9 -> {
                    testResultLevel.text = getString(R.string.anxietyR2)
                }
                in 10..14 -> {
                    testResultLevel.text = getString(R.string.anxietyR3)
                }
                in 15..21 -> {
                    testResultLevel.text = getString(R.string.anxietyR4)
                }
            }
        }

        //Depression Test
        val comingFromDepressionTest = arguments?.getBoolean("comingFromDepressionTest", false)

        val scoreResultDepression = arguments?.getInt("DepressionScore", 0) ?: 0
        testResultScore.text = "$scoreResultDepression"

        if (comingFromDepressionTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesDepressionIndex = (advicesListDepression.indices).random()
            val randomAdvicesDepression = advicesListAnxiety[randomAdvicesDepressionIndex]

            tipsOrQuotesOrAdvice.text = randomAdvicesDepression

            when (scoreResultDepression) {
                in 0..4 -> {
                    testResultLevel.text = getString(R.string.depressionR1)
                }

                in 5..9 -> {
                    testResultLevel.text = getString(R.string.depressionR2)
                }

                in 10..14 -> {
                    testResultLevel.text = getString(R.string.depressionR3)
                }

                in 15..19 -> {
                    testResultLevel.text = getString(R.string.depressionR4)
                }

                in 20..27 -> {
                    testResultLevel.text = getString(R.string.depressionR5)
                }
            }
        }

        //InternetAddiction Test
        val comingFromInternetAddictionTest = arguments?.getBoolean("comingFromInternetAddictionTest", false)

        val scoreResultInternetAddiction = arguments?.getInt("InternetAddictionScore", 0) ?: 0
        testResultScore.text = "$scoreResultInternetAddiction"

        if (comingFromInternetAddictionTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesInternetAddictionIndex = (advicesListInternetAddiction.indices).random()
            val advicesListInternetAddiction = advicesListAnxiety[randomAdvicesInternetAddictionIndex]

            tipsOrQuotesOrAdvice.text = advicesListInternetAddiction

            when (scoreResultInternetAddiction) {
                in 0..30 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR1)
                }

                in 31..49 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR2)
                }

                in 50..79 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR3)
                }

                in 80..100 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR4)
                }

            }
        }

        //Stress Test
        val comingFromStressTest = arguments?.getBoolean("comingFromStressTest", false)

        val scoreResultStress = arguments?.getInt("StressScore", 0) ?: 0
        testResultScore.text = "$scoreResultStress"

        if (comingFromStressTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesStressIndex = (advicesListStress.indices).random()
            val advicesListStress = advicesListAnxiety[randomAdvicesStressIndex]

            tipsOrQuotesOrAdvice.text = advicesListStress

            when (scoreResultStress) {
                in 0..13 -> {
                    testResultLevel.text = getString(R.string.stressR1)
                }

                in 14..26 -> {
                    testResultLevel.text = getString(R.string.stressR2)
                }

                in 27..40 -> {
                    testResultLevel.text = getString(R.string.stressR3)
                }
            }
        }

        val toResultDoneB = view.findViewById<Button>(R.id.resultDoneButton)

        toResultDoneB.setOnClickListener {
            val resultDoneS = ResultDoneFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultDoneS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}