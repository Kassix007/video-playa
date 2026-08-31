.class public final La6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:La6/v;

.field public static final b:LX5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La6/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La6/v;->a:La6/v;

    .line 7
    .line 8
    sget-object v0, LX5/h;->d:LX5/h;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [LX5/f;

    .line 12
    .line 13
    const-string v2, "kotlinx.serialization.json.JsonNull"

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, La/a;->k(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/I1;[LX5/f;)LX5/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La6/v;->b:LX5/g;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, La6/v;->b:LX5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, LD5/a;->m(LY5/b;)Lb6/i;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LY5/b;->f()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget-object p1, La6/u;->INSTANCE:La6/u;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    new-instance p1, Lb6/c;

    .line 14
    .line 15
    const-string v0, "Expected \'null\' literal"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method
