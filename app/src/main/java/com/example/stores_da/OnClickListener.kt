package com.example.stores_da

interface OnClickListener {
    fun onClick(storeId: Long)
    fun onFavoriteStore(storeEntity: StoreEntity)
    fun onDeleteStore(storeEntity: StoreEntity)
}