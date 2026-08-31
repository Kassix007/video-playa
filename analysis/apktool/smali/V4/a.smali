.class public final synthetic LV4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, LV4/a;->q:I

    iput-object p1, p0, LV4/a;->r:Ljava/lang/Object;

    iput-object p2, p0, LV4/a;->s:Ljava/lang/Object;

    iput-object p3, p0, LV4/a;->t:Ljava/lang/Object;

    iput-object p4, p0, LV4/a;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, LV4/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LV4/a;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, LV4/a;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/work/impl/model/WorkGenerationalId;

    .line 13
    .line 14
    iget-object v2, p0, LV4/a;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/work/Configuration;

    .line 17
    .line 18
    iget-object v3, p0, LV4/a;->u:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroidx/work/impl/WorkDatabase;

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Landroidx/work/impl/Schedulers;->b(Ljava/util/List;Landroidx/work/impl/model/WorkGenerationalId;Landroidx/work/Configuration;Landroidx/work/impl/WorkDatabase;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, LV4/a;->r:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, LI2/y;

    .line 29
    .line 30
    iget-object v1, p0, LV4/a;->s:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LU2/g;

    .line 33
    .line 34
    iget-object v2, p0, LV4/a;->t:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lcom/web2native/MainActivity;

    .line 37
    .line 38
    iget-object v3, p0, LV4/a;->u:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lkotlin/jvm/internal/y;

    .line 41
    .line 42
    new-instance v4, LI2/s;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-direct {v4, v0, v1, v5}, LI2/s;-><init>(LI2/y;LU2/g;Lq5/c;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 49
    .line 50
    invoke-static {v0, v4}, LM5/y;->x(Lq5/h;LB5/e;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, LU2/j;

    .line 55
    .line 56
    instance-of v1, v0, LU2/p;

    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    check-cast v0, LU2/p;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v0, v5

    .line 64
    :goto_0
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v0, v0, LU2/p;->a:LI2/n;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {v2}, Lh/h;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "getResources(...)"

    .line 75
    .line 76
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, LI2/q;->b(LI2/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :cond_1
    iput-object v5, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
