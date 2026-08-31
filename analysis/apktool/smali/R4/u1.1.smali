.class public final synthetic LR4/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/u1;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/u1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/u1;->a:LR4/u1;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.MultiWindowSupport"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "openWindow"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "closeWindow"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, LR4/u1;->descriptor:LX5/f;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 5

    .line 1
    sget-object v0, LR4/w1;->c:[Lm5/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, LV5/a;

    .line 11
    .line 12
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    aget-object v0, v0, v3

    .line 18
    .line 19
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LV5/a;

    .line 24
    .line 25
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v4, 0x2

    .line 30
    new-array v4, v4, [LV5/a;

    .line 31
    .line 32
    aput-object v2, v4, v1

    .line 33
    .line 34
    aput-object v0, v4, v3

    .line 35
    .line 36
    return-object v4
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/u1;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, LR4/u1;->descriptor:LX5/f;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, LR4/w1;->c:[Lm5/h;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v6, v2

    .line 13
    move v7, v3

    .line 14
    move-object v5, v4

    .line 15
    :goto_0
    if-eqz v6, :cond_3

    .line 16
    .line 17
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    const/4 v9, -0x1

    .line 22
    if-eq v8, v9, :cond_2

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    if-ne v8, v2, :cond_0

    .line 27
    .line 28
    aget-object v8, v1, v2

    .line 29
    .line 30
    invoke-interface {v8}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, LV5/a;

    .line 35
    .line 36
    invoke-interface {p1, v0, v2, v8, v5}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/util/List;

    .line 41
    .line 42
    or-int/lit8 v7, v7, 0x2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, LV5/e;

    .line 46
    .line 47
    invoke-direct {p1, v8}, LV5/e;-><init>(I)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    aget-object v8, v1, v3

    .line 52
    .line 53
    invoke-interface {v8}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, LV5/a;

    .line 58
    .line 59
    invoke-interface {p1, v0, v3, v8, v4}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/util/List;

    .line 64
    .line 65
    or-int/lit8 v7, v7, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v6, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 71
    .line 72
    .line 73
    new-instance p1, LR4/w1;

    .line 74
    .line 75
    invoke-direct {p1, v7, v4, v5}, LR4/w1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    return-object p1
.end method
