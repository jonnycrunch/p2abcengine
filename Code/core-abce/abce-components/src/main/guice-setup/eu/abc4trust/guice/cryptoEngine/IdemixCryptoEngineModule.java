//* Licensed Materials - Property of IBM                              *
//* eu.abc4trust.pabce.1.0                                            *
//* (C) Copyright IBM Corp. 2012. All Rights Reserved.                *
//* US Government Users Restricted Rights - Use, duplication or       *
//* disclosure restricted by GSA ADP Schedule Contract with IBM Corp. *
//*/**/****************************************************************

package eu.abc4trust.guice.cryptoEngine;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import eu.abc4trust.cryptoEngine.idemix.issuer.IdemixCryptoEngineIssuerImpl;
import eu.abc4trust.cryptoEngine.idemix.user.IdemixCryptoEngineUserImpl;
import eu.abc4trust.cryptoEngine.idemix.verifier.IdemixCryptoEngineVerifierImpl;
import eu.abc4trust.cryptoEngine.inspector.CryptoEngineInspector;
import eu.abc4trust.cryptoEngine.inspector.CryptoEngineInspectorImpl;
import eu.abc4trust.cryptoEngine.issuer.CryptoEngineIssuer;
import eu.abc4trust.cryptoEngine.revauth.AccumCryptoEngineRevAuthImpl;
import eu.abc4trust.cryptoEngine.revocation.CryptoEngineRevocation;
import eu.abc4trust.cryptoEngine.user.CryptoEngineUser;
import eu.abc4trust.cryptoEngine.verifier.CryptoEngineVerifier;

public class IdemixCryptoEngineModule extends AbstractModule {

  @Override
  protected void configure() {
    this.bind(CryptoEngineIssuer.class).to(IdemixCryptoEngineIssuerImpl.class).in(Singleton.class);
    this.bind(CryptoEngineVerifier.class).to(IdemixCryptoEngineVerifierImpl.class).in(Singleton.class);
    this.bind(CryptoEngineUser.class).to(IdemixCryptoEngineUserImpl.class).in(Singleton.class);
    this.bind(CryptoEngineInspector.class).to(CryptoEngineInspectorImpl.class).in(Singleton.class);
    this.bind(CryptoEngineRevocation.class).to(AccumCryptoEngineRevAuthImpl.class).in(Singleton.class);
  }

}