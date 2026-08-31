.class public abstract LC0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/f1;


# static fields
.field public static final a:LP/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv0/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lv0/s;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LC0/g1;->a:LP/f0;

    .line 12
    .line 13
    return-void
.end method
