.class public final synthetic LN5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN5/c;->q:I

    iput-object p2, p0, LN5/c;->r:Ljava/lang/Object;

    iput-object p3, p0, LN5/c;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LN5/c;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LN5/c;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LN5/c;->r:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lm1/b;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Typeface;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lm1/b;->i(Landroid/graphics/Typeface;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast v2, Landroidx/room/F;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Runnable;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/room/F;->a()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    invoke-virtual {v2}, Landroidx/room/F;->a()V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :pswitch_1
    check-cast v2, Le0/c;

    .line 38
    .line 39
    check-cast v1, Landroid/util/LongSparseArray;

    .line 40
    .line 41
    invoke-static {v2, v1}, LC3/a;->v(Le0/c;Landroid/util/LongSparseArray;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    check-cast v2, Lh/h;

    .line 46
    .line 47
    check-cast v1, Lb/A;

    .line 48
    .line 49
    sget v0, Lb/l;->J:I

    .line 50
    .line 51
    iget-object v0, v2, Lk1/e;->q:Landroidx/lifecycle/z;

    .line 52
    .line 53
    new-instance v3, Lb/e;

    .line 54
    .line 55
    invoke-direct {v3, v1, v2}, Lb/e;-><init>(Lb/A;Lh/h;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3}, Landroidx/lifecycle/z;->a(Landroidx/lifecycle/w;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3
    check-cast v2, Ljava/util/List;

    .line 63
    .line 64
    check-cast v1, Landroidx/work/impl/constraints/trackers/ConstraintTracker;

    .line 65
    .line 66
    invoke-static {v2, v1}, Landroidx/work/impl/constraints/trackers/ConstraintTracker;->a(Ljava/util/List;Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_4
    check-cast v2, Landroidx/work/impl/background/greedy/TimeLimiter;

    .line 71
    .line 72
    check-cast v1, Landroidx/work/impl/StartStopToken;

    .line 73
    .line 74
    invoke-static {v2, v1}, Landroidx/work/impl/background/greedy/TimeLimiter;->a(Landroidx/work/impl/background/greedy/TimeLimiter;Landroidx/work/impl/StartStopToken;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_5
    check-cast v2, Ljava/lang/Runnable;

    .line 79
    .line 80
    check-cast v1, Landroidx/room/F;

    .line 81
    .line 82
    const-string v0, "$command"

    .line 83
    .line 84
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v0, "this$0"

    .line 88
    .line 89
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :try_start_1
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Landroidx/room/F;->a()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    invoke-virtual {v1}, Landroidx/room/F;->a()V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :pswitch_6
    check-cast v2, Lcom/web2native/MainActivity;

    .line 105
    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    :try_start_2
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 122
    .line 123
    .line 124
    :goto_0
    return-void

    .line 125
    :pswitch_7
    check-cast v2, LM5/h;

    .line 126
    .line 127
    check-cast v1, LN5/f;

    .line 128
    .line 129
    invoke-virtual {v2, v1}, LM5/h;->C(LM5/s;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
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
