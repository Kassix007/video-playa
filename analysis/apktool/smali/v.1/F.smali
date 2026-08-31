.class public final Lv/F;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lv/F;->q:I

    iput-object p2, p0, Lv/F;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv/F;->q:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lv/F;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lz0/S;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/S;->a()Lz0/y;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, v1, Lz0/y;->q:LB0/L;

    .line 17
    .line 18
    invoke-virtual {v2}, LB0/L;->o()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, LR/b;

    .line 23
    .line 24
    iget-object v3, v3, LR/b;->q:LR/e;

    .line 25
    .line 26
    iget v3, v3, LR/e;->s:I

    .line 27
    .line 28
    iget v4, v1, Lz0/y;->D:I

    .line 29
    .line 30
    if-eq v4, v3, :cond_4

    .line 31
    .line 32
    iget-object v1, v1, Lz0/y;->v:Lr/G;

    .line 33
    .line 34
    iget-object v3, v1, Lr/G;->c:[Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v1, v1, Lr/G;->a:[J

    .line 37
    .line 38
    array-length v4, v1

    .line 39
    add-int/lit8 v4, v4, -0x2

    .line 40
    .line 41
    const/4 v5, 0x7

    .line 42
    const/4 v6, 0x0

    .line 43
    if-ltz v4, :cond_3

    .line 44
    .line 45
    move v7, v6

    .line 46
    :goto_0
    aget-wide v8, v1, v7

    .line 47
    .line 48
    not-long v10, v8

    .line 49
    shl-long/2addr v10, v5

    .line 50
    and-long/2addr v10, v8

    .line 51
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v10, v12

    .line 57
    cmp-long v10, v10, v12

    .line 58
    .line 59
    if-eqz v10, :cond_2

    .line 60
    .line 61
    sub-int v10, v7, v4

    .line 62
    .line 63
    not-int v10, v10

    .line 64
    ushr-int/lit8 v10, v10, 0x1f

    .line 65
    .line 66
    const/16 v11, 0x8

    .line 67
    .line 68
    rsub-int/lit8 v10, v10, 0x8

    .line 69
    .line 70
    move v12, v6

    .line 71
    :goto_1
    if-ge v12, v10, :cond_1

    .line 72
    .line 73
    const-wide/16 v13, 0xff

    .line 74
    .line 75
    and-long/2addr v13, v8

    .line 76
    const-wide/16 v15, 0x80

    .line 77
    .line 78
    cmp-long v13, v13, v15

    .line 79
    .line 80
    if-gez v13, :cond_0

    .line 81
    .line 82
    shl-int/lit8 v13, v7, 0x3

    .line 83
    .line 84
    add-int/2addr v13, v12

    .line 85
    aget-object v13, v3, v13

    .line 86
    .line 87
    check-cast v13, Lz0/r;

    .line 88
    .line 89
    const/4 v14, 0x1

    .line 90
    iput-boolean v14, v13, Lz0/r;->d:Z

    .line 91
    .line 92
    :cond_0
    shr-long/2addr v8, v11

    .line 93
    add-int/lit8 v12, v12, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    if-ne v10, v11, :cond_3

    .line 97
    .line 98
    :cond_2
    if-eq v7, v4, :cond_3

    .line 99
    .line 100
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    invoke-virtual {v2}, LB0/L;->q()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    invoke-static {v2, v6, v5}, LB0/L;->S(LB0/L;ZI)V

    .line 110
    .line 111
    .line 112
    :cond_4
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 113
    .line 114
    return-object v1

    .line 115
    :pswitch_0
    iget-object v1, v0, Lv/F;->r:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Lw/z0;

    .line 118
    .line 119
    iget-boolean v1, v1, Lc0/l;->D:Z

    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    return-object v1

    .line 126
    :pswitch_1
    iget-object v1, v0, Lv/F;->r:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, LO5/i;

    .line 129
    .line 130
    invoke-interface {v1}, LO5/v;->i()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-static {v1}, LO5/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lw/Q;

    .line 139
    .line 140
    return-object v1

    .line 141
    :pswitch_2
    iget-object v1, v0, Lv/F;->r:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lv/I;

    .line 144
    .line 145
    iget-object v1, v1, Lv/I;->L:Lh0/o;

    .line 146
    .line 147
    const/4 v2, 0x7

    .line 148
    invoke-virtual {v1, v2}, Lh0/o;->B0(I)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    return-object v1

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
