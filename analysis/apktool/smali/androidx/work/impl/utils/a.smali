.class public final synthetic Landroidx/work/impl/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Landroidx/work/impl/WorkManagerImpl;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/WorkManagerImpl;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/work/impl/utils/a;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/utils/a;->s:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/work/impl/utils/a;->r:Landroidx/work/impl/WorkManagerImpl;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/work/impl/WorkManagerImpl;Ljava/util/UUID;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/work/impl/utils/a;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/utils/a;->r:Landroidx/work/impl/WorkManagerImpl;

    iput-object p2, p0, Landroidx/work/impl/utils/a;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/work/impl/utils/a;->q:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/work/impl/utils/a;->s:Ljava/lang/Object;

    check-cast v0, Ljava/util/UUID;

    iget-object v1, p0, Landroidx/work/impl/utils/a;->r:Landroidx/work/impl/WorkManagerImpl;

    invoke-static {v1, v0}, Landroidx/work/impl/utils/CancelWorkRunnable$forId$1;->a(Landroidx/work/impl/WorkManagerImpl;Ljava/util/UUID;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/work/impl/utils/a;->s:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, Landroidx/work/impl/utils/a;->r:Landroidx/work/impl/WorkManagerImpl;

    invoke-static {v0, v1}, Landroidx/work/impl/utils/CancelWorkRunnable$forAll$1;->a(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/WorkManagerImpl;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
