.class public final synthetic LZ4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LZ4/d;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LZ4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ4/d;->a:LZ4/d;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.feature_offer_card.Card"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "size"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "position"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "bgColor"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "content"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, LZ4/d;->descriptor:LX5/f;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 6

    .line 1
    sget-object v0, LZ5/a0;->a:LZ5/a0;

    .line 2
    .line 3
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v3, LZ4/j;->a:LZ4/j;

    .line 16
    .line 17
    invoke-static {v3}, LC3/a;->A(LV5/a;)LV5/a;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x4

    .line 22
    new-array v4, v4, [LV5/a;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    aput-object v1, v4, v5

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aput-object v2, v4, v1

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    aput-object v0, v4, v1

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    aput-object v3, v4, v0

    .line 35
    .line 36
    return-object v4
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LZ4/d;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, LZ4/d;->descriptor:LX5/f;

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
    const/4 v3, 0x0

    .line 10
    move v5, v2

    .line 11
    move-object v6, v3

    .line 12
    move-object v7, v6

    .line 13
    move-object v8, v7

    .line 14
    move-object v9, v8

    .line 15
    move v3, v1

    .line 16
    :goto_0
    if-eqz v3, :cond_5

    .line 17
    .line 18
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v4, v10, :cond_4

    .line 24
    .line 25
    if-eqz v4, :cond_3

    .line 26
    .line 27
    if-eq v4, v1, :cond_2

    .line 28
    .line 29
    const/4 v10, 0x2

    .line 30
    if-eq v4, v10, :cond_1

    .line 31
    .line 32
    const/4 v10, 0x3

    .line 33
    if-ne v4, v10, :cond_0

    .line 34
    .line 35
    sget-object v4, LZ4/j;->a:LZ4/j;

    .line 36
    .line 37
    invoke-interface {p1, v0, v10, v4, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v9, v4

    .line 42
    check-cast v9, LZ4/l;

    .line 43
    .line 44
    or-int/lit8 v5, v5, 0x8

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, LV5/e;

    .line 48
    .line 49
    invoke-direct {p1, v4}, LV5/e;-><init>(I)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    sget-object v4, LZ5/a0;->a:LZ5/a0;

    .line 54
    .line 55
    invoke-interface {p1, v0, v10, v4, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    move-object v8, v4

    .line 60
    check-cast v8, Ljava/lang/String;

    .line 61
    .line 62
    or-int/lit8 v5, v5, 0x4

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object v4, LZ5/a0;->a:LZ5/a0;

    .line 66
    .line 67
    invoke-interface {p1, v0, v1, v4, v7}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    move-object v7, v4

    .line 72
    check-cast v7, Ljava/lang/String;

    .line 73
    .line 74
    or-int/lit8 v5, v5, 0x2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    sget-object v4, LZ5/a0;->a:LZ5/a0;

    .line 78
    .line 79
    invoke-interface {p1, v0, v2, v4, v6}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    move-object v6, v4

    .line 84
    check-cast v6, Ljava/lang/String;

    .line 85
    .line 86
    or-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    move v3, v2

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 92
    .line 93
    .line 94
    new-instance v4, LZ4/f;

    .line 95
    .line 96
    invoke-direct/range {v4 .. v9}, LZ4/f;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZ4/l;)V

    .line 97
    .line 98
    .line 99
    return-object v4
.end method
