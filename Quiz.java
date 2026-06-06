public quiz(){
questions = new Question[5];
question[0] = new Question(" Quelle est la capitale du Togo?" , "Lomé");
question[1] = new Question(" Combien font 5 + 3?" , "8");
question[2] = new Question(" Java est un langage de programmation?" , "Oui");
question[3] = new Question(" Combiende jours y'a t-il dans la semaine?" , "7");
question[4] = new Question(" L'Afrique compte combien de pays?" , "54");
}
public void lancerQuiz(Joueur joueur) {
Scanner clavier= new Scanner(System.in);
for (int i = 0; i< questions.length; i++) {
System.out.println("\nQuestion" +(i+1));
System.out.println(question[i].getEnonce());
String rep =clavier.nextLine();
if(questions[i].verifierReponse(rep)){
joueur.ajouterPoint()
}
}
