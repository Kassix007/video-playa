.class public final synthetic LR4/Z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB0/o;


# direct methods
.method public synthetic constructor <init>(ILB0/o;)V
    .locals 0

    .line 1
    iput p1, p0, LR4/Z0;->q:I

    iput-object p2, p0, LR4/Z0;->r:LB0/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LR4/Z0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/Z0;->r:LB0/o;

    .line 7
    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "it"

    .line 11
    .line 12
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, LB0/o;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LR4/k1;

    .line 18
    .line 19
    iget-object v0, v0, LR4/k1;->H:LR4/l3;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    iget-object v0, p0, LR4/Z0;->r:LB0/o;

    .line 30
    .line 31
    check-cast p1, Lm5/y;

    .line 32
    .line 33
    iget-object p1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, LR4/k1;

    .line 36
    .line 37
    iget-object p1, p1, LR4/k1;->I:LB0/o;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p1, p1, LB0/o;->r:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, LY4/d;

    .line 44
    .line 45
    iget-object v0, p1, LY4/d;->g:Ly4/e;

    .line 46
    .line 47
    iget-object p1, p1, LY4/d;->d:LY4/c;

    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, v0, Ly4/e;->b:Ly4/c;

    .line 51
    .line 52
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 53
    :try_start_1
    iget-object v2, v1, Ly4/c;->a:LE1/t;

    .line 54
    .line 55
    const-string v3, "unregisterListener"

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    new-array v4, v4, [Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v1, Ly4/c;->d:Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ly4/c;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    monitor-exit v0

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 76
    :try_start_4
    throw p1

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 79
    throw p1

    .line 80
    :cond_1
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_1
    iget-object v0, p0, LR4/Z0;->r:LB0/o;

    .line 84
    .line 85
    check-cast p1, Lm5/y;

    .line 86
    .line 87
    iget-object p1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, LR4/k1;

    .line 90
    .line 91
    iget-object p1, p1, LR4/k1;->I:LB0/o;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    iget-object p1, p1, LB0/o;->r:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, LY4/d;

    .line 98
    .line 99
    iget-boolean v0, p1, LY4/d;->i:Z

    .line 100
    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    iget-object v0, p1, LY4/d;->g:Ly4/e;

    .line 104
    .line 105
    invoke-virtual {v0}, Ly4/e;->a()V

    .line 106
    .line 107
    .line 108
    :cond_2
    const/4 v0, 0x0

    .line 109
    iput-boolean v0, p1, LY4/d;->i:Z

    .line 110
    .line 111
    :cond_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_2
    iget-object v0, p0, LR4/Z0;->r:LB0/o;

    .line 115
    .line 116
    check-cast p1, Lm5/y;

    .line 117
    .line 118
    iget-object p1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, LR4/k1;

    .line 121
    .line 122
    iget-object p1, p1, LR4/k1;->I:LB0/o;

    .line 123
    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    iget-object p1, p1, LB0/o;->r:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p1, LY4/d;

    .line 129
    .line 130
    iget-object v0, p1, LY4/d;->g:Ly4/e;

    .line 131
    .line 132
    invoke-virtual {v0}, Ly4/e;->b()LS3/k;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v1, LY4/b;

    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    invoke-direct {v1, p1, v2}, LY4/b;-><init>(LY4/d;I)V

    .line 140
    .line 141
    .line 142
    new-instance p1, LR4/L0;

    .line 143
    .line 144
    const/4 v2, 0x4

    .line 145
    invoke-direct {p1, v2, v1}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    sget-object v1, LS3/f;->a:LO3/Q0;

    .line 152
    .line 153
    invoke-virtual {v0, v1, p1}, LS3/k;->a(Ljava/util/concurrent/Executor;LS3/c;)LS3/k;

    .line 154
    .line 155
    .line 156
    :cond_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
