package org.tron.common.zksnark;

public class JLibsodium {

  public static final int crypto_generichash_blake2b_PERSONALBYTES = 16;
  public static final int crypto_aead_chacha20poly1305_ietf_NPUBBYTES = 12;
  public static final int crypto_aead_chacha20poly1305_IETF_NPUBBYTES = crypto_aead_chacha20poly1305_ietf_NPUBBYTES;
  private static final Libsodium INSTANCE = LibsodiumWrapper.getInstance();

  public static int cryptoGenerichashBlake2bInitSaltPersonal(
      long state, byte[] key, int keylen, int outlen, byte[] salt, byte[] personal) {
    return INSTANCE
        .cryptoGenerichashBlake2BInitSaltPersonal(state, key, keylen, outlen, salt, personal);
  }

  public static int cryptoGenerichashBlake2bUpdate(
      long state, byte[] in, long inlen) {
    return INSTANCE.cryptoGenerichashBlake2BUpdate(state, in, inlen);
  }

  public static int cryptoGenerichashBlake2bFinal(
      long state, byte[] out, int outlen) {
    return INSTANCE.cryptoGenerichashBlake2BFinal(state, out, outlen);
  }

  public static int cryptoGenerichashBlack2bSaltPersonal(byte[] out, int outlen, byte[] in,
      long inlen, byte[] key, int keylen, byte[] salt, byte[] personal) {
    return INSTANCE.cryptoGenerichashBlake2BSaltPersonal(out, outlen, in, inlen, key, keylen, salt,
        personal);
  }

  public static int cryptoAeadChacha20poly1305IetfDecrypt(byte[] m, long[] mlen_p, byte[] nsec,
      byte[] c, long clen, byte[] ad, long adlen, byte[] npub, byte[] k) {
    return INSTANCE
        .cryptoAeadChacha20Poly1305IetfDecrypt(m, mlen_p, nsec, c, clen, ad, adlen, npub, k);
  }

  public static int cryptoAeadChacha20Poly1305IetfEncrypt(byte[] c, long[] clen_p, byte[] m,
      long mlen, byte[] ad, long adlen, byte[] nsec, byte[] npub, byte[] k) {
    return INSTANCE
        .cryptoAeadChacha20Poly1305IetfEncrypt(c, clen_p, m, mlen, ad, adlen, nsec, npub, k);
  }

  public static long initState() {
    return INSTANCE.cryptoGenerichashBlake2BStateInit();
  }

  public static void freeState(long state) {
    INSTANCE.cryptoGenerichashBlake2BStateFree(state);
  }
}