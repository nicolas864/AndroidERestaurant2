package fr.isen.roussel.androiderestaurant.network


import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Ingredient(@SerializedName("name_fr") val name: String): Serializable {}