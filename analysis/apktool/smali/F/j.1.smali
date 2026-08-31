.class public final LF/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF/j;->q:I

    iput-object p2, p0, LF/j;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lv0/o;Lq5/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p2

    .line 2
    iget v0, p0, LF/j;->q:I

    .line 3
    .line 4
    const/4 v2, 0x7

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v10, Lm5/y;->a:Lm5/y;

    .line 7
    .line 8
    sget-object v11, Lr5/a;->q:Lr5/a;

    .line 9
    .line 10
    iget-object v4, p0, LF/j;->r:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v0, LO3/l;

    .line 16
    .line 17
    invoke-direct {v0}, LO3/l;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v3, LF/p;

    .line 21
    .line 22
    check-cast v4, Lw/C;

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    invoke-direct {v3, v2, v4, v0}, LF/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, LA/J;

    .line 29
    .line 30
    const/16 v5, 0x10

    .line 31
    .line 32
    invoke-direct {v2, v0, p1, v4, v5}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lw/w;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct {v5, v4, v6}, Lw/w;-><init>(Lw/C;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lw/w;

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    invoke-direct {v6, v4, v7}, Lw/w;-><init>(Lw/C;I)V

    .line 45
    .line 46
    .line 47
    new-instance v7, LB0/j0;

    .line 48
    .line 49
    const/16 v8, 0xd

    .line 50
    .line 51
    invoke-direct {v7, v8, v0, v4}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lw/v;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    move-object v1, v4

    .line 58
    move-object v4, v2

    .line 59
    move-object v2, p1

    .line 60
    invoke-direct/range {v0 .. v8}, Lw/v;-><init>(Lw/C;Lv0/o;LF/p;LA/J;Lw/w;Lw/w;LB0/j0;Lq5/c;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, p2}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne v0, v11, :cond_0

    .line 68
    .line 69
    move-object v10, v0

    .line 70
    :cond_0
    return-object v10

    .line 71
    :pswitch_0
    new-instance v0, Lv/k;

    .line 72
    .line 73
    check-cast v4, Lv/l;

    .line 74
    .line 75
    invoke-direct {v0, v4, v3}, Lv/k;-><init>(Lv/l;Lq5/c;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v0, p2}, Lw/p0;->c(Lv0/o;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v11, :cond_1

    .line 83
    .line 84
    move-object v10, v0

    .line 85
    :cond_1
    return-object v10

    .line 86
    :pswitch_1
    check-cast v4, Lv/x;

    .line 87
    .line 88
    new-instance v0, Lv/w;

    .line 89
    .line 90
    invoke-direct {v0, v4, v3}, Lv/w;-><init>(Lv/x;Lq5/c;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Lm0/a;

    .line 94
    .line 95
    invoke-direct {v3, v2, v4}, Lm0/a;-><init>(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v2, Lw/g1;->a:Le3/u;

    .line 99
    .line 100
    new-instance v4, Lw/g0;

    .line 101
    .line 102
    invoke-direct {v4, p1}, Lw/g0;-><init>(LW0/c;)V

    .line 103
    .line 104
    .line 105
    move-object v2, v0

    .line 106
    new-instance v0, Lw/P0;

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    move-object v1, p1

    .line 110
    invoke-direct/range {v0 .. v5}, Lw/P0;-><init>(Lv0/o;Lv/w;Lm0/a;Lw/g0;Lq5/c;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, p2}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-ne v0, v11, :cond_2

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    move-object v0, v10

    .line 121
    :goto_0
    if-ne v0, v11, :cond_3

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    move-object v0, v10

    .line 125
    :goto_1
    if-ne v0, v11, :cond_4

    .line 126
    .line 127
    move-object v10, v0

    .line 128
    :cond_4
    return-object v10

    .line 129
    :pswitch_2
    check-cast v4, La5/y;

    .line 130
    .line 131
    new-instance v0, LJ5/i;

    .line 132
    .line 133
    const/16 v5, 0x9

    .line 134
    .line 135
    invoke-direct {v0, v5, v4}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1, v3, v0, p2, v2}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-ne v0, v11, :cond_5

    .line 143
    .line 144
    move-object v10, v0

    .line 145
    :cond_5
    return-object v10

    .line 146
    :pswitch_3
    new-instance v0, LF/i;

    .line 147
    .line 148
    check-cast v4, LF/e;

    .line 149
    .line 150
    invoke-direct {v0, p1, v4, v3}, LF/i;-><init>(Lv0/o;LF/e;Lq5/c;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0, p2}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-ne v0, v11, :cond_6

    .line 158
    .line 159
    move-object v10, v0

    .line 160
    :cond_6
    return-object v10

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
