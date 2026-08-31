.class public final synthetic LR4/A1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/A1;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/A1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/A1;->a:LR4/A1;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.NativeDataStore"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "enable"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, LR4/A1;->descriptor:LX5/f;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [LV5/a;

    .line 3
    .line 4
    sget-object v1, LZ5/f;->a:LZ5/f;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    return-object v0
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/A1;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LR4/A1;->descriptor:LX5/f;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v1

    .line 10
    move v4, v2

    .line 11
    move v5, v4

    .line 12
    :goto_0
    if-eqz v3, :cond_2

    .line 13
    .line 14
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    const/4 v7, -0x1

    .line 19
    if-eq v6, v7, :cond_1

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    invoke-interface {p1, v0, v2}, LY5/a;->c(LX5/f;I)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    move v4, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, LV5/e;

    .line 30
    .line 31
    invoke-direct {p1, v6}, LV5/e;-><init>(I)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    move v3, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, LR4/C1;

    .line 41
    .line 42
    invoke-direct {p1, v4, v5}, LR4/C1;-><init>(IZ)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method
