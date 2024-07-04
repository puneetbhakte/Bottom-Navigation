package com.example.assignment.data

import android.os.Parcel
import android.os.Parcelable

class  Constants() {
    constructor(parcel: Parcel) : this() {

    }

    fun getdata():ArrayList<AccountHolderData> {
    val datalist = ArrayList<AccountHolderData>()
    val data1 = AccountHolderData("PB","Puneet Bhakte")
    datalist.add(data1)

    val data2 = AccountHolderData("KS","Kunal Shinde")
    datalist.add(data2)

    val data3 = AccountHolderData("AJ","Ajay Jadhav")
    datalist.add(data3)

    val data4 = AccountHolderData("HR","Harsh Rajput")
    datalist.add(data4)

    val data5 = AccountHolderData("AB","Abhay Bhosle")
    datalist.add(data5)

    val data6 = AccountHolderData("SB","Soham Bhosle")
    datalist.add(data6)

    val data7 = AccountHolderData("RP","Rohan Patil")
    datalist.add(data7)

    val data8 = AccountHolderData("KB","Karan Bhatia")
    datalist.add(data8)

    val data9 = AccountHolderData("RM","Rahul Mali")
    datalist.add(data9)

    val data10 = AccountHolderData("SG","Siddesh Ganpate")
    datalist.add(data1)

    return datalist

}
}