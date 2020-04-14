package com.example.myapplication.Api;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class okmanager_OkFactory implements Factory<OkHttpClient.Builder> {
  private final okmanager module;

  public okmanager_OkFactory(okmanager module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient.Builder get() {
    return Preconditions.checkNotNull(
        module.ok(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient.Builder> create(okmanager module) {
    return new okmanager_OkFactory(module);
  }
}
