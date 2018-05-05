package com.example.kiran.cr7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AchieveFragment extends Fragment {


    public AchieveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_achieve, container, false);
        TextView textView = (TextView) view.findViewById(R.id.achievetxt);
        textView.setText("World\n\n\n" +
                "--The most expensive footballer in history: 2009–2013\n" +
                "--Most international goals in a calendar year: 25 (in 2012, shared with Vivian Woodward and Lionel Messi)\n" +
                "--First footballer to reach 40 goals in a professional league for two consecutive seasons\n" +
                "--Only player to score in every minute of an official football game\n" +
                "--Only player to win the League title, Domestic Cup, Domestic Supercup, Champions League, Club World Cup, League Player of the Year, Golden Shoe and Ballon d'Or at two different clubs (Manchester United and Real Madrid)\n" +
                "--Most appearances in the FIFPro World XI: 8 times (2007–2014) (shared with Lionel Messi)\n" +
                "--First and only player to appear in the FIFPro World XI for two different clubs.\n" +
                "--Only player to have won more than one FIFA Club World Cup Silver Ball.\n" +
                "--Guinness World Record for Most Liked Person on Facebook: 2015\n" +
                "--Only player in the world who has scored in the 2004, 2008, 2012 and 2016 editions of the European Championship; and in the 2006, 2010 and 2014 editions of the World Cup.\n\n\n" +
                "Europe\n" +
                "\n" +
                "\n" +
                "--Most goals scored in European competitions (club football): 96 goals\n" +
                "--Most goals scored in the UEFA Champions League: 95 goals\n" +
                "--Most goals scored in a UEFA Champions League/European Cup season: 17 goals in 2013–14\n" +
                "--Most goals scored in the UEFA Champions League group stage: 11 goals in 2015–16\n" +
                "--Most goals scored in UEFA Champions League knockout phase: 42 goals\n" +
                "--Most UEFA Champions League goals scored in a calendar year: 15 goals in 2013\n" +
                "--Only player to score 15 or more UEFA Champions League goals in two different seasons: in 2013–14 and 2015–16\n" +
                "--The first player in the history of UEFA Champions League to score three hat-tricks in a single season: in 2015–16\n" +
                "--First footballer to have won the European Golden Shoe in two different leagues: English Premier League (2007–08) and Spanish La Liga (2010–11, 2013–14, 2014–15)\n" +
                "--Most goals scored in the UEFA European Championship, including qualifying: 29 goals, for Portugal\n" +
                "--Most career goals at UEFA European Championship finals: 9 goals, for Portugal (tied with Michel Platini)\n" +
                "--Only player to have scored at four UEFA European Championship finals: 2004, 2008, 2012, 2016\n" +
                "--Only player to have scored three or above (goals) at more than one UEFA European Championship finals: 3 goals in 2012 and in 2016\n" +
                "--Most headed goals at UEFA European Championship finals: 5\n" +
                "--Highest appearance-maker at UEFA European Championship finals: 20 appearances\n" +
                "--First player to appear in three UEFA European Championship semi-finals: 2004, 2012, 2016 (Germany's Bastian Schweinsteiger featured in his third last-four clash 24 hours later)\n" +
                "--First player to ever score 10 goals in four consecutive UEFA Champions League seasons: 2011–12 to 2014–15\n" +
                "--Only player to score for two different winning teams in the European Cup: Manchester United (2007–08) and Real Madrid (2013–14)\n" +
                "--Most away goals scored in Champions League history: 42 goals\n" +
                "--Most consecutive UEFA Champions League away games scored in: 12\n" +
                "--Most wins in the UEFA Champions League Knockout phase: 29 wins\n" +
                "--Most braces scored in the UEFA Champions League: 20\n" +
                "--Most European Golden Shoe awards: 4\n" +
                "--Most UEFA Team of the Year appearances: 10 times\n" +
                "--Most consecutive appearances in the UEFA Team of the Year: 9 (2007–2015)\n" +
                "--Only player to appear in more than position in the UEFA Team of the Year.\n" +
                "--Only player to be among the finalists for all the editions of the UEFA Best Player in Europe Award: 2010–11 to 2015–16\n" +
                "--Fastest player to score 350 goals for one club (335 games)\n" +
                "--Most UEFA Best Player in Europe awards: 3 (2008, 2014, 2016) (shared with Lionel Messi)\n\n\n" +
                "Spain\n" +
                "\n" +
                "\n" +
                "--Most hat-tricks in La Liga history: 30[570]\n" +
                "--Fastest La Liga player to score 150 league goals (140 games)\n" +
                "--Fastest La Liga player to score 200 league goals (178 games)\n" +
                "--Fastest player to reach 300 official club goals\n" +
                "--Most consecutive Clásico matches scored in: 6 matches\n" +
                "--Best scoring start in a Spanish league season: 15 goals in eight rounds\n" +
                "--Fastest footballer to score 20 league goals: 12 games (missed one game due to injury)\n" +
                "--Only player to reach 30 goals in six consecutive La Liga seasons\n" +
                "--Most teams scored against in a season (2012–13): 19 (shared with Ronaldo and Lionel Messi)\n" +
                "--Most La Liga hat-tricks in a season: 8 hat-tricks (shared with Lionel Messi)\n" +
                "--Most hat-tricks scored in all competitions: 36\n\n\n" +
                "Real Madrid\n" +
                "\n" +
                "\n" +
                "--Real Madrid all-time top goalscorer: 360 goals[552]\n" +
                "--Top goalscorer in La Liga: 256 goals[552]\n" +
                "--Fastest player to reach 50 league goals\n" +
                "--Fastest player to reach 100 league goals\n" +
                "--Fastest player to reach 200 official goals\n" +
                "--Fastest player to reach 250 official goals\n" +
                "--Most goals scored in seven consecutive league matches: 15 goals\n" +
                "--First player to score in eight consecutive matchdays\n" +
                "--Most hat-tricks in Real Madrid's history: 37\n" +
                "--Real Madrid Record Goalscorer in UEFA Champions League: 78 goals\n" +
                "--Real Madrid Record Goalscorer in European Competitions: 80 goals");
        return view;
    }
}
