.class public final synthetic LR4/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/o2;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/o2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/o2;->a:LR4/o2;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.RichBottomBarTabs"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "url"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "label"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "icon"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "type"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "floatingBtnPosition"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "expandableIcons"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, LR4/o2;->descriptor:LX5/f;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 9

    .line 1
    sget-object v0, LR4/q2;->g:[Lm5/h;

    .line 2
    .line 3
    sget-object v1, LZ5/a0;->a:LZ5/a0;

    .line 4
    .line 5
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v6, 0x5

    .line 26
    aget-object v0, v0, v6

    .line 27
    .line 28
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LV5/a;

    .line 33
    .line 34
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v7, 0x6

    .line 39
    new-array v7, v7, [LV5/a;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    aput-object v2, v7, v8

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    aput-object v3, v7, v2

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    aput-object v4, v7, v2

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    aput-object v5, v7, v2

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    aput-object v1, v7, v2

    .line 55
    .line 56
    aput-object v0, v7, v6

    .line 57
    .line 58
    return-object v7
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/o2;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, LR4/o2;->descriptor:LX5/f;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, LR4/q2;->g:[Lm5/h;

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
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 55
    .line 56
    const/4 v13, 0x4

    .line 57
    invoke-interface {p1, v0, v13, v5, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    move-object v11, v5

    .line 62
    check-cast v11, Ljava/lang/String;

    .line 63
    .line 64
    or-int/lit8 v6, v6, 0x10

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_2
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 68
    .line 69
    const/4 v13, 0x3

    .line 70
    invoke-interface {p1, v0, v13, v5, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    move-object v10, v5

    .line 75
    check-cast v10, Ljava/lang/String;

    .line 76
    .line 77
    or-int/lit8 v6, v6, 0x8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_3
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 81
    .line 82
    const/4 v13, 0x2

    .line 83
    invoke-interface {p1, v0, v13, v5, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    move-object v9, v5

    .line 88
    check-cast v9, Ljava/lang/String;

    .line 89
    .line 90
    or-int/lit8 v6, v6, 0x4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_4
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 94
    .line 95
    invoke-interface {p1, v0, v2, v5, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    move-object v8, v5

    .line 100
    check-cast v8, Ljava/lang/String;

    .line 101
    .line 102
    or-int/lit8 v6, v6, 0x2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_5
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 106
    .line 107
    invoke-interface {p1, v0, v3, v5, v7}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    move-object v7, v5

    .line 112
    check-cast v7, Ljava/lang/String;

    .line 113
    .line 114
    or-int/lit8 v6, v6, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_6
    move v4, v3

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 120
    .line 121
    .line 122
    new-instance v5, LR4/q2;

    .line 123
    .line 124
    invoke-direct/range {v5 .. v12}, LR4/q2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    return-object v5

    .line 128
    nop

    .line 129
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
