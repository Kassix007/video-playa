.class public final synthetic Landroidx/work/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/l;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lm5/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lm5/e;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/work/a;->q:I

    iput-object p1, p0, Landroidx/work/a;->r:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/work/a;->s:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/work/a;->t:Lm5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/concurrent/futures/k;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/work/a;->q:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/work/a;->r:Ljava/lang/Object;

    check-cast v0, Lq5/h;

    iget-object v1, p0, Landroidx/work/a;->s:Ljava/lang/Object;

    check-cast v1, LM5/x;

    iget-object v2, p0, Landroidx/work/a;->t:Lm5/e;

    check-cast v2, LB5/e;

    invoke-static {v0, v1, v2, p1}, Landroidx/work/ListenableFutureKt;->b(Lq5/h;LM5/x;LB5/e;Landroidx/concurrent/futures/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/work/a;->r:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/work/a;->s:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Landroidx/work/a;->t:Lm5/e;

    check-cast v2, LB5/a;

    invoke-static {v0, v1, v2, p1}, Landroidx/work/ListenableFutureKt;->d(Ljava/util/concurrent/Executor;Ljava/lang/String;LB5/a;Landroidx/concurrent/futures/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
