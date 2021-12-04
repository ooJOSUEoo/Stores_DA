package com.example.stores_da

interface MainAux {
    fun hideFab(isVisible: Boolean = false)

    fun addStore(storeEntity: StoreEntity)
    fun updateStore(storeEntity: StoreEntity)
}