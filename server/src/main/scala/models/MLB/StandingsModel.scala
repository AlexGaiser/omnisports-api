package models.MLB

case class StandingsResponse(
                              copyright: String,
                              records: List[MLBRecord]
                            )

case class TeamRecord(
                       team: MLBTeam,
                       season: Int,
                       clinchIndicator: Option[String],
                       divisionRank: Int,
                       gamesPlayed: Int,
                       records: GameRecords

                     )

case class MLBRecord(
                      standingsType: String,
                      league: MLBLeague,
                      division: MLBDivision,
                      sport: MLBSport,
                      teamRecords: List[TeamRecord],
                    )


case class GameRecords(
                        splitRecords: List[SplitRecord]
                      )

case class SplitRecord(
                        wins: Int,
                        losses: Int,
                        `type`: String,
                        pct: Double
                      )


trait MLBScope {
  val id: Int
  val link: String
}

case class MLBLeague(id: Int, link: String) extends MLBScope

case class MLBDivision(id: Int, link: String) extends MLBScope

case class MLBSport(id: Int, link: String) extends MLBScope

case class LeagueRecord(wins: Int, losses: Int, ties: Int, pct: Double)