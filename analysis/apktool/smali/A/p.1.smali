.class public final LA/p;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/io/Serializable;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, LA/p;->q:I

    iput-object p1, p0, LA/p;->r:Ljava/lang/Object;

    iput-object p2, p0, LA/p;->s:Ljava/lang/Object;

    iput-object p3, p0, LA/p;->t:Ljava/lang/Object;

    iput-object p4, p0, LA/p;->u:Ljava/io/Serializable;

    iput-object p5, p0, LA/p;->v:Ljava/lang/Object;

    iput-object p6, p0, LA/p;->w:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LA/p;->q:I

    .line 4
    .line 5
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    iget-object v3, v0, LA/p;->w:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, LA/p;->v:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, LA/p;->u:Ljava/io/Serializable;

    .line 12
    .line 13
    iget-object v6, v0, LA/p;->t:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, LA/p;->s:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, LA/p;->r:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, LI0/i;

    .line 25
    .line 26
    check-cast v8, LM/I0;

    .line 27
    .line 28
    check-cast v7, Ljava/lang/String;

    .line 29
    .line 30
    check-cast v6, Ljava/lang/String;

    .line 31
    .line 32
    check-cast v5, Ljava/lang/String;

    .line 33
    .line 34
    check-cast v4, LB5/a;

    .line 35
    .line 36
    check-cast v3, LM5/w;

    .line 37
    .line 38
    new-instance v9, LF/Q;

    .line 39
    .line 40
    const/4 v10, 0x1

    .line 41
    invoke-direct {v9, v4, v10}, LF/Q;-><init>(LB5/a;I)V

    .line 42
    .line 43
    .line 44
    sget-object v4, LI0/r;->a:[LH5/k;

    .line 45
    .line 46
    sget-object v4, LI0/h;->t:LI0/s;

    .line 47
    .line 48
    new-instance v10, LI0/a;

    .line 49
    .line 50
    invoke-direct {v10, v7, v9}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v4, v10}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v8, LM/I0;->c:LN/r;

    .line 57
    .line 58
    iget-object v4, v4, LN/r;->g:LP/f0;

    .line 59
    .line 60
    invoke-virtual {v4}, LP/f0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, LM/J0;

    .line 65
    .line 66
    sget-object v7, LM/J0;->s:LM/J0;

    .line 67
    .line 68
    if-ne v4, v7, :cond_0

    .line 69
    .line 70
    new-instance v4, LC/k;

    .line 71
    .line 72
    const/4 v5, 0x5

    .line 73
    invoke-direct {v4, v8, v3, v8, v5}, LC/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    sget-object v3, LI0/h;->r:LI0/s;

    .line 77
    .line 78
    new-instance v5, LI0/a;

    .line 79
    .line 80
    invoke-direct {v5, v6, v4}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3, v5}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iget-object v4, v8, LM/I0;->c:LN/r;

    .line 88
    .line 89
    invoke-virtual {v4}, LN/r;->d()LN/y;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-object v4, v4, LN/y;->a:Ljava/util/Map;

    .line 94
    .line 95
    invoke-interface {v4, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_1

    .line 100
    .line 101
    new-instance v4, LB0/K;

    .line 102
    .line 103
    const/16 v6, 0xb

    .line 104
    .line 105
    invoke-direct {v4, v6, v8, v3}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v3, LI0/h;->s:LI0/s;

    .line 109
    .line 110
    new-instance v6, LI0/a;

    .line 111
    .line 112
    invoke-direct {v6, v5, v4}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v3, v6}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    :goto_0
    return-object v2

    .line 119
    :pswitch_0
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, Lz0/I;

    .line 122
    .line 123
    move-object v14, v8

    .line 124
    check-cast v14, [Lz0/J;

    .line 125
    .line 126
    move-object v15, v7

    .line 127
    check-cast v15, Ljava/util/List;

    .line 128
    .line 129
    check-cast v6, LB0/T;

    .line 130
    .line 131
    check-cast v5, Lkotlin/jvm/internal/w;

    .line 132
    .line 133
    check-cast v4, Lkotlin/jvm/internal/w;

    .line 134
    .line 135
    check-cast v3, LA/q;

    .line 136
    .line 137
    array-length v7, v14

    .line 138
    const/4 v8, 0x0

    .line 139
    move v9, v8

    .line 140
    :goto_1
    if-ge v8, v7, :cond_2

    .line 141
    .line 142
    move v10, v8

    .line 143
    aget-object v8, v14, v10

    .line 144
    .line 145
    add-int/lit8 v16, v9, 0x1

    .line 146
    .line 147
    const-string v11, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    .line 148
    .line 149
    invoke-static {v8, v11}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v15, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    check-cast v9, Lz0/B;

    .line 157
    .line 158
    move v11, v10

    .line 159
    invoke-interface {v6}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    move v12, v11

    .line 164
    iget v11, v5, Lkotlin/jvm/internal/w;->q:I

    .line 165
    .line 166
    move v13, v12

    .line 167
    iget v12, v4, Lkotlin/jvm/internal/w;->q:I

    .line 168
    .line 169
    move/from16 v17, v13

    .line 170
    .line 171
    iget-object v13, v3, LA/q;->a:Lc0/e;

    .line 172
    .line 173
    move/from16 v18, v7

    .line 174
    .line 175
    move-object v7, v1

    .line 176
    move/from16 v1, v18

    .line 177
    .line 178
    invoke-static/range {v7 .. v13}, LA/n;->b(Lz0/I;Lz0/J;Lz0/B;LW0/l;IILc0/e;)V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v8, v17, 0x1

    .line 182
    .line 183
    move-object v9, v7

    .line 184
    move v7, v1

    .line 185
    move-object v1, v9

    .line 186
    move/from16 v9, v16

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_2
    return-object v2

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
