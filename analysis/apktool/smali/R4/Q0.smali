.class public final synthetic LR4/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/Q0;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/Q0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/Q0;->a:LR4/Q0;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.HeaderConfiguration"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headerStyle"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "spaceFromTop"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "headerBgColor"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "spaceFromSides"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "enableFloatingHeader"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, LR4/Q0;->descriptor:LX5/f;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 7

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
    sget-object v2, LZ5/C;->a:LZ5/C;

    .line 8
    .line 9
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, LZ5/f;->a:LZ5/f;

    .line 18
    .line 19
    invoke-static {v4}, LC3/a;->A(LV5/a;)LV5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x5

    .line 24
    new-array v5, v5, [LV5/a;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    aput-object v1, v5, v6

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    aput-object v2, v5, v1

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    aput-object v0, v5, v1

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    aput-object v3, v5, v0

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    aput-object v4, v5, v0

    .line 40
    .line 41
    return-object v5
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/Q0;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, LR4/Q0;->descriptor:LX5/f;

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
    move v7, v5

    .line 12
    move-object v6, v3

    .line 13
    move-object v8, v6

    .line 14
    move-object v9, v8

    .line 15
    move-object v10, v9

    .line 16
    move v3, v1

    .line 17
    :goto_0
    if-eqz v3, :cond_6

    .line 18
    .line 19
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v11, -0x1

    .line 24
    if-eq v4, v11, :cond_5

    .line 25
    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    if-eq v4, v1, :cond_3

    .line 29
    .line 30
    const/4 v11, 0x2

    .line 31
    if-eq v4, v11, :cond_2

    .line 32
    .line 33
    const/4 v11, 0x3

    .line 34
    if-eq v4, v11, :cond_1

    .line 35
    .line 36
    const/4 v11, 0x4

    .line 37
    if-ne v4, v11, :cond_0

    .line 38
    .line 39
    sget-object v4, LZ5/f;->a:LZ5/f;

    .line 40
    .line 41
    invoke-interface {p1, v0, v11, v4, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v10, v4

    .line 46
    check-cast v10, Ljava/lang/Boolean;

    .line 47
    .line 48
    or-int/lit8 v5, v5, 0x10

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, LV5/e;

    .line 52
    .line 53
    invoke-direct {p1, v4}, LV5/e;-><init>(I)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_1
    sget-object v4, LZ5/C;->a:LZ5/C;

    .line 58
    .line 59
    invoke-interface {p1, v0, v11, v4, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    move-object v9, v4

    .line 64
    check-cast v9, Ljava/lang/Integer;

    .line 65
    .line 66
    or-int/lit8 v5, v5, 0x8

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    sget-object v4, LZ5/a0;->a:LZ5/a0;

    .line 70
    .line 71
    invoke-interface {p1, v0, v11, v4, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v8, v4

    .line 76
    check-cast v8, Ljava/lang/String;

    .line 77
    .line 78
    or-int/lit8 v5, v5, 0x4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-interface {p1, v0, v1}, LY5/a;->o(LX5/f;I)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    or-int/lit8 v5, v5, 0x2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    sget-object v4, LZ5/a0;->a:LZ5/a0;

    .line 89
    .line 90
    invoke-interface {p1, v0, v2, v4, v6}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    move-object v6, v4

    .line 95
    check-cast v6, Ljava/lang/String;

    .line 96
    .line 97
    or-int/lit8 v5, v5, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    move v3, v2

    .line 101
    goto :goto_0

    .line 102
    :cond_6
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 103
    .line 104
    .line 105
    new-instance v4, LR4/S0;

    .line 106
    .line 107
    invoke-direct/range {v4 .. v10}, LR4/S0;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    .line 108
    .line 109
    .line 110
    return-object v4
.end method
