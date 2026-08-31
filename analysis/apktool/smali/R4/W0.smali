.class public final synthetic LR4/W0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/W0;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/W0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/W0;->a:LR4/W0;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.IAPScreenData"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "disableOnFirstLoad"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "disableForDays"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "enable"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "bgColor"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "pages"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "actionButtons"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, LR4/W0;->descriptor:LX5/f;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 10

    .line 1
    sget-object v0, LR4/Y0;->g:[Lm5/h;

    .line 2
    .line 3
    sget-object v1, LZ5/f;->a:LZ5/f;

    .line 4
    .line 5
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v3, LZ5/C;->a:LZ5/C;

    .line 10
    .line 11
    invoke-static {v3}, LC3/a;->A(LV5/a;)LV5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v4, LZ5/a0;->a:LZ5/a0;

    .line 20
    .line 21
    invoke-static {v4}, LC3/a;->A(LV5/a;)LV5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x4

    .line 26
    aget-object v6, v0, v5

    .line 27
    .line 28
    invoke-interface {v6}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, LV5/a;

    .line 33
    .line 34
    invoke-static {v6}, LC3/a;->A(LV5/a;)LV5/a;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const/4 v7, 0x5

    .line 39
    aget-object v0, v0, v7

    .line 40
    .line 41
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LV5/a;

    .line 46
    .line 47
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v8, 0x6

    .line 52
    new-array v8, v8, [LV5/a;

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    aput-object v2, v8, v9

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    aput-object v3, v8, v2

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    aput-object v1, v8, v2

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    aput-object v4, v8, v1

    .line 65
    .line 66
    aput-object v6, v8, v5

    .line 67
    .line 68
    aput-object v0, v8, v7

    .line 69
    .line 70
    return-object v8
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/W0;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, LR4/W0;->descriptor:LX5/f;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, LR4/Y0;->g:[Lm5/h;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v6, v3

    .line 13
    move-object v7, v4

    .line 14
    move-object v8, v7

    .line 15
    move-object v9, v8

    .line 16
    move-object v10, v9

    .line 17
    move-object v11, v10

    .line 18
    move-object v12, v11

    .line 19
    move v4, v2

    .line 20
    :goto_0
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    packed-switch v5, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    new-instance p1, LV5/e;

    .line 30
    .line 31
    invoke-direct {p1, v5}, LV5/e;-><init>(I)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :pswitch_0
    const/4 v5, 0x5

    .line 36
    aget-object v13, v1, v5

    .line 37
    .line 38
    invoke-interface {v13}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v13

    .line 42
    check-cast v13, LV5/a;

    .line 43
    .line 44
    invoke-interface {p1, v0, v5, v13, v12}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    move-object v12, v5

    .line 49
    check-cast v12, Ljava/util/List;

    .line 50
    .line 51
    or-int/lit8 v6, v6, 0x20

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_1
    const/4 v5, 0x4

    .line 55
    aget-object v13, v1, v5

    .line 56
    .line 57
    invoke-interface {v13}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    check-cast v13, LV5/a;

    .line 62
    .line 63
    invoke-interface {p1, v0, v5, v13, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    move-object v11, v5

    .line 68
    check-cast v11, Ljava/util/List;

    .line 69
    .line 70
    or-int/lit8 v6, v6, 0x10

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_2
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 74
    .line 75
    const/4 v13, 0x3

    .line 76
    invoke-interface {p1, v0, v13, v5, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    move-object v10, v5

    .line 81
    check-cast v10, Ljava/lang/String;

    .line 82
    .line 83
    or-int/lit8 v6, v6, 0x8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_3
    sget-object v5, LZ5/f;->a:LZ5/f;

    .line 87
    .line 88
    const/4 v13, 0x2

    .line 89
    invoke-interface {p1, v0, v13, v5, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    move-object v9, v5

    .line 94
    check-cast v9, Ljava/lang/Boolean;

    .line 95
    .line 96
    or-int/lit8 v6, v6, 0x4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_4
    sget-object v5, LZ5/C;->a:LZ5/C;

    .line 100
    .line 101
    invoke-interface {p1, v0, v2, v5, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v8, v5

    .line 106
    check-cast v8, Ljava/lang/Integer;

    .line 107
    .line 108
    or-int/lit8 v6, v6, 0x2

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_5
    sget-object v5, LZ5/f;->a:LZ5/f;

    .line 112
    .line 113
    invoke-interface {p1, v0, v3, v5, v7}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    move-object v7, v5

    .line 118
    check-cast v7, Ljava/lang/Boolean;

    .line 119
    .line 120
    or-int/lit8 v6, v6, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_6
    move v4, v3

    .line 124
    goto :goto_0

    .line 125
    :cond_0
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 126
    .line 127
    .line 128
    new-instance v5, LR4/Y0;

    .line 129
    .line 130
    invoke-direct/range {v5 .. v12}, LR4/Y0;-><init>(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    return-object v5

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
