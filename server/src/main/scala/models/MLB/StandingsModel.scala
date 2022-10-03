package models.MLB

case class StandingsResponse(copyright: String)

case class TeamRecord(
                       team: MLBTeam,
                       season: Int,
                       clinchIndicator: String,
                       divisionRank: Int,
                       gamesPlayed: Int
                     )

case class Record(
                   standingsType: String,
                   league: MLBLeague,
                   division: MLBDivision,
                   sport: MLBSport,
                   teamRecords: List[TeamRecord],
                   leagueRecord: LeagueRecord
                 )

trait MLBScope {
  val id: Int
  val link: String
}

case class MLBLeague(id: Int, link: String) extends MLBScope

case class MLBDivision(id: Int, link: String) extends MLBScope

case class MLBSport(id: Int, link: String) extends MLBScope

case class LeagueRecord(wins: Int, losses: Int, ties: Int, pct: Float)