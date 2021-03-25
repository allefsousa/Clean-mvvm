package com.developer.mvvmclean.data.model

data class CategoryResponse(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

//fun CategoryResponse.toCategory() = Category(
//    id = this.idCategory,
//    name = this.strCategory,
//    thumb = this.strCategoryThumb,
//    description = this.strCategoryDescription
//)