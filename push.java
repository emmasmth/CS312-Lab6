// a push! -- put up on screen


abstract class Choice
{
  final String NO = "loose";
  final String TIE = "tie";
  final String YES = "win";

  abstract String beats(Choice other);
  ...
}


class Rock extends Choice
{
  public String beats(Choice other) { other.isBetenByRock(); }
}

