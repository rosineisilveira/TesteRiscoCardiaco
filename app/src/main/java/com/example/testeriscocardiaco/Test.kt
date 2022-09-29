package com.example.testeriscocardiaco

import android.os.Parcel
import android.os.Parcelable




data class Test(var total: Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
       parcel.writeInt(total)
    }

    companion object CREATOR : Parcelable.Creator<Test> {
        override fun createFromParcel(parcel: Parcel): Test {
            return Test(parcel)
        }

        override fun newArray(size: Int): Array<Test?> {
            return arrayOfNulls(size)
        }
    }
}


