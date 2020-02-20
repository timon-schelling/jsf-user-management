package de.timokrates.accessgranted.repository.token

interface TokenRepository : Iterable<Token> {
    fun add(tokenId: TokenId): Token
    fun remove(tokenId: TokenId): Token?
    fun find(tokenId: TokenId): Token?
}