package com.example.assignment.data

import android.os.Parcel
import android.os.Parcelable

data class AccountHolderData(
    var Title:String ,
    var Name : String):Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString()?:""
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Title)
        parcel.writeString(Name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AccountHolderData> {
        override fun createFromParcel(parcel: Parcel): AccountHolderData {
            return AccountHolderData(parcel)
        }

        override fun newArray(size: Int): Array<AccountHolderData?> {
            return arrayOfNulls(size)
        }
    }


}
