.class public final synthetic LR4/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/d1;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/d1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/d1;->a:LR4/d1;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.LoaderConfig"

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "animationSize"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "animationShape"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "animationBgColor"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "type"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "loadPercentOffset"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "loaderColor"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "bgColor"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "enableShadow"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    sput-object v1, LR4/d1;->descriptor:LX5/f;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 10

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
    move-result-object v3

    .line 15
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    sget-object v5, LZ5/q;->a:LZ5/q;

    .line 20
    .line 21
    invoke-static {v5}, LC3/a;->A(LV5/a;)LV5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v7, LZ5/f;->a:LZ5/f;

    .line 34
    .line 35
    invoke-static {v7}, LC3/a;->A(LV5/a;)LV5/a;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const/16 v8, 0x8

    .line 40
    .line 41
    new-array v8, v8, [LV5/a;

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    aput-object v1, v8, v9

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    aput-object v2, v8, v1

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aput-object v3, v8, v1

    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    aput-object v4, v8, v1

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    aput-object v5, v8, v1

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    aput-object v6, v8, v1

    .line 60
    .line 61
    const/4 v1, 0x6

    .line 62
    aput-object v0, v8, v1

    .line 63
    .line 64
    const/4 v0, 0x7

    .line 65
    aput-object v7, v8, v0

    .line 66
    .line 67
    return-object v8
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/d1;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 16

    .line 1
    sget-object v0, LR4/d1;->descriptor:LX5/f;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

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
    move-object v13, v12

    .line 20
    move-object v14, v13

    .line 21
    move v4, v2

    .line 22
    :goto_0
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, LY5/a;->j(LX5/f;)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    packed-switch v5, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    new-instance v0, LV5/e;

    .line 32
    .line 33
    invoke-direct {v0, v5}, LV5/e;-><init>(I)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :pswitch_0
    sget-object v5, LZ5/f;->a:LZ5/f;

    .line 38
    .line 39
    const/4 v15, 0x7

    .line 40
    invoke-interface {v1, v0, v15, v5, v14}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object v14, v5

    .line 45
    check-cast v14, Ljava/lang/Boolean;

    .line 46
    .line 47
    or-int/lit16 v6, v6, 0x80

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_1
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 51
    .line 52
    const/4 v15, 0x6

    .line 53
    invoke-interface {v1, v0, v15, v5, v13}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    move-object v13, v5

    .line 58
    check-cast v13, Ljava/lang/String;

    .line 59
    .line 60
    or-int/lit8 v6, v6, 0x40

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_2
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 64
    .line 65
    const/4 v15, 0x5

    .line 66
    invoke-interface {v1, v0, v15, v5, v12}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    move-object v12, v5

    .line 71
    check-cast v12, Ljava/lang/String;

    .line 72
    .line 73
    or-int/lit8 v6, v6, 0x20

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_3
    sget-object v5, LZ5/q;->a:LZ5/q;

    .line 77
    .line 78
    const/4 v15, 0x4

    .line 79
    invoke-interface {v1, v0, v15, v5, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    move-object v11, v5

    .line 84
    check-cast v11, Ljava/lang/Double;

    .line 85
    .line 86
    or-int/lit8 v6, v6, 0x10

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_4
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 90
    .line 91
    const/4 v15, 0x3

    .line 92
    invoke-interface {v1, v0, v15, v5, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    move-object v10, v5

    .line 97
    check-cast v10, Ljava/lang/String;

    .line 98
    .line 99
    or-int/lit8 v6, v6, 0x8

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_5
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 103
    .line 104
    const/4 v15, 0x2

    .line 105
    invoke-interface {v1, v0, v15, v5, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    move-object v9, v5

    .line 110
    check-cast v9, Ljava/lang/String;

    .line 111
    .line 112
    or-int/lit8 v6, v6, 0x4

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :pswitch_6
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 116
    .line 117
    invoke-interface {v1, v0, v2, v5, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    move-object v8, v5

    .line 122
    check-cast v8, Ljava/lang/String;

    .line 123
    .line 124
    or-int/lit8 v6, v6, 0x2

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_7
    sget-object v5, LZ5/a0;->a:LZ5/a0;

    .line 128
    .line 129
    invoke-interface {v1, v0, v3, v5, v7}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    move-object v7, v5

    .line 134
    check-cast v7, Ljava/lang/String;

    .line 135
    .line 136
    or-int/lit8 v6, v6, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_8
    move v4, v3

    .line 140
    goto :goto_0

    .line 141
    :cond_0
    invoke-interface {v1, v0}, LY5/a;->l(LX5/f;)V

    .line 142
    .line 143
    .line 144
    new-instance v5, LR4/f1;

    .line 145
    .line 146
    invoke-direct/range {v5 .. v14}, LR4/f1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 147
    .line 148
    .line 149
    return-object v5

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
