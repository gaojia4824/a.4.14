package com.example.myapplication.Api;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class okmanager_ProvideinterFactory implements Factory<OkHttpClient> {
  private final okmanager module;

  public okmanager_ProvideinterFactory(okmanager module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideinter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(okmanager module) {
    return new okmanager_ProvideinterFactory(module);
  }
}
