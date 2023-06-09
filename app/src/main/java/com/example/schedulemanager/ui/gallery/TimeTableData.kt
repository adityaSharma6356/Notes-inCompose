package com.example.schedulemanager.ui.gallery

import java.text.SimpleDateFormat
import java.util.Calendar

val defaultusertimetabledata = TimeTableData(
    0,
    0,
    listOf(
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
        Lecture("" , false),
    ),
    0,
    Time(0, 0),
    Time(0, 0),
    0
)

var Day = TT(
    listOf("DLCD" , "DS" , "OOPs" , "DM" , "CM" , "DLCD-A/OOPs-B" , "DLCD-A/OOPs-B") ,
    listOf("CM" , "DLCD" , "DM" , "OOPs" , "IKS" , "DS-A" , "DS-A" ) ,
    listOf("" , "DS" , "OOPs" , "CM" , "DM" , "CM-A" , "CM-A") ,
    listOf("DLCD" , "DS" , "IKS" , "DLCD-B/OOPs-A" , "DLCD-B/OOPs-A" , "OOPs" , "DM") ,
    listOf("CM" , "DLCD" , "DS" , "DS-A/CM-A" , "DS-A/CM-A" , "" , "")
)


val calander = Calander(
    listOf(
        "Fri 30-Dec",  "Sat 31-Dec",  "Sun 01-Jan",  "Mon 02-Jan",  "Tue 03-Jan",  "Wed 04-Jan",  "Thu 05-Jan",  "Fri 06-Jan",  "Sat 07-Jan",  "Sun 08-Jan",  "Mon 09-Jan",  "Tue 10-Jan",  "Wed 11-Jan",  "Thu 12-Jan",  "Fri 13-Jan",  "Sat 14-Jan",  "Sun 15-Jan",  "Mon 16-Jan",  "Tue 17-Jan",  "Wed 18-Jan",  "Thu 19-Jan",  "Fri 20-Jan",  "Sat 21-Jan",  "Sun 22-Jan",  "Mon 23-Jan",  "Tue 24-Jan",  "Wed 25-Jan",  "Thu 26-Jan",  "Fri 27-Jan",  "Sat 28-Jan",  "Sun 29-Jan",  "Mon 30-Jan",  "Tue 31-Jan",  "Wed 01-Feb",  "Thu 02-Feb",  "Fri 03-Feb",  "Sat 04-Feb",  "Sun 05-Feb",  "Mon 06-Feb",  "Tue 07-Feb",  "Wed 08-Feb",  "Thu 09-Feb",  "Fri 10-Feb",  "Sat 11-Feb",  "Sun 12-Feb",  "Mon 13-Feb",  "Tue 14-Feb",  "Wed 15-Feb",  "Thu 16-Feb",  "Fri 17-Feb",  "Sat 18-Feb",  "Sun 19-Feb",  "Mon 20-Feb",  "Tue 21-Feb",  "Wed 22-Feb",  "Thu 23-Feb",  "Fri 24-Feb",  "Sat 25-Feb",  "Sun 26-Feb",  "Mon 27-Feb",  "Tue 28-Feb",  "Wed 01-Mar",  "Thu 02-Mar",  "Fri 03-Mar",  "Sat 04-Mar",  "Sun 05-Mar",  "Mon 06-Mar",  "Tue 07-Mar",  "Wed 08-Mar",  "Thu 09-Mar",  "Fri 10-Mar",  "Sat 11-Mar",  "Sun 12-Mar",  "Mon 13-Mar",  "Tue 14-Mar",  "Wed 15-Mar",  "Thu 16-Mar",  "Fri 17-Mar",  "Sat 18-Mar",  "Sun 19-Mar",  "Mon 20-Mar",  "Tue 21-Mar",  "Wed 22-Mar",  "Thu 23-Mar",  "Fri 24-Mar",  "Sat 25-Mar",  "Sun 26-Mar",  "Mon 27-Mar",  "Tue 28-Mar",  "Wed 29-Mar",  "Thu 30-Mar",  "Fri 31-Mar",  "Sat 01-Apr",  "Sun 02-Apr",  "Mon 03-Apr",  "Tue 04-Apr",  "Wed 05-Apr",  "Thu 06-Apr",  "Fri 07-Apr",  "Sat 08-Apr",  "Sun 09-Apr",  "Mon 10-Apr",  "Tue 11-Apr",  "Wed 12-Apr",  "Thu 13-Apr",  "Fri 14-Apr",  "Sat 15-Apr",  "Sun 16-Apr",  "Mon 17-Apr",  "Tue 18-Apr",  "Wed 19-Apr",  "Thu 20-Apr",  "Fri 21-Apr",  "Sat 22-Apr",  "Sun 23-Apr",  "Mon 24-Apr",  "Tue 25-Apr",  "Wed 26-Apr",  "Thu 27-Apr",  "Fri 28-Apr",  "Sat 29-Apr",  "Sun 30-Apr",  "Mon 01-May",  "Tue 02-May",  "Wed 03-May",  "Thu 04-May",  "Fri 05-May",  "Sat 06-May",  "Sun 07-May",  "Mon 08-May",  "Tue 09-May",  "Wed 10-May",  "Thu 11-May",  "Fri 12-May",  "Sat 13-May",  "Sun 14-May",  "Mon 15-May",  "Tue 16-May",  "Wed 17-May",  "Thu 18-May",  "Fri 19-May",  "Sat 20-May",  "Sun 21-May",  "Mon 22-May",  "Tue 23-May",  "Wed 24-May",  "Thu 25-May",  "Fri 26-May",  "Sat 27-May",  "Sun 28-May",  "Mon 29-May",  "Tue 30-May",  "Wed 31-May",  "Thu 01-Jun",  "Fri 02-Jun",  "Sat 03-Jun",  "Sun 04-Jun",  "Mon 05-Jun",  "Tue 06-Jun",  "Wed 07-Jun",  "Thu 08-Jun",  "Fri 09-Jun",  "Sat 10-Jun",  "Sun 11-Jun",  "Mon 12-Jun",  "Tue 13-Jun",  "Wed 14-Jun",  "Thu 15-Jun",  "Fri 16-Jun",  "Sat 17-Jun",  "Sun 18-Jun",  "Mon 19-Jun",  "Tue 20-Jun",  "Wed 21-Jun",  "Thu 22-Jun",  "Fri 23-Jun",  "Sat 24-Jun",  "Sun 25-Jun",  "Mon 26-Jun",  "Tue 27-Jun",  "Wed 28-Jun",  "Thu 29-Jun",  "Fri 30-Jun",  "Sat 01-Jul",  "Sun 02-Jul",  "Mon 03-Jul",  "Tue 04-Jul",  "Wed 05-Jul",  "Thu 06-Jul",  "Fri 07-Jul",  "Sat 08-Jul",  "Sun 09-Jul",  "Mon 10-Jul",  "Tue 11-Jul",  "Wed 12-Jul",  "Thu 13-Jul",  "Fri 14-Jul",  "Sat 15-Jul",  "Sun 16-Jul",  "Mon 17-Jul",
    ),
    listOf(
        "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat",  "Sun",  "Mon",
    ),
    listOf(
        "12",  "12",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "01",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "02",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "03",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "04",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "05",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "06",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",  "07",
    ),
    listOf(
        "22",  "22",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",  "23",
    ),
    listOf(
        "30",  "31",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",  "18",  "19",  "20",  "21",  "22",  "23",  "24",  "25",  "26",  "27",  "28",  "29",  "30",  "31",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",  "18",  "19",  "20",  "21",  "22",  "23",  "24",  "25",  "26",  "27",  "28",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",  "18",  "19",  "20",  "21",  "22",  "23",  "24",  "25",  "26",  "27",  "28",  "29",  "30",  "31",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",  "18",  "19",  "20",  "21",  "22",  "23",  "24",  "25",  "26",  "27",  "28",  "29",  "30",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",  "18",  "19",  "20",  "21",  "22",  "23",  "24",  "25",  "26",  "27",  "28",  "29",  "30",  "31",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",  "18",  "19",  "20",  "21",  "22",  "23",  "24",  "25",  "26",  "27",  "28",  "29",  "30",  "01",  "02",  "03",  "04",  "05",  "06",  "07",  "08",  "09",  "10",  "11",  "12",  "13",  "14",  "15",  "16",  "17",
    )
)


fun daydata ( index : Int , period : Int) : String{
    if(period==9 && calander.daylist[index]!="Sun" && calander.daylist[index]!="Sat") return "LUNCH BREAK"
    else if(period==9) return ""
    when(calander.daylist[index]) {
        "Mon"->  return Day.Monday[period]
        "Tue"->  return Day.Tuesday[period]
        "Wed"->  return Day.Wednesday[period]
        "Thu"->  return Day.Thursday[period]
        "Fri"->  return Day.Friday[period]
    }
    return ""
}

fun gettime(): String = Calendar.getInstance().get(Calendar.HOUR).toString()

data class TT (
    val Monday : List<String>,
    val Tuesday : List<String>,
    val Wednesday : List<String>,
    val Thursday : List<String>,
    val Friday : List<String>,
        )

data class Calander (
    val datelist : List<String>,
    val daylist : List<String>,
    val monthlist : List<String>,
    val Yearslist : List<String>,
    val singledatelist : List<String>
)

data class TimeTableData(
    val LectureDuration : Int,
    val NumberOfSubjects : Int,
    val LectureList : List<Lecture>,
    val workingDays : Int,
    val startingTime : Time,
    val endingTime: Time,
    val breakDuration : Int
)

data class Lecture(
    val Name : String,
    val isLectureALab : Boolean
)

data class Time(
    val hour : Int,
    val Minute : Int,
)