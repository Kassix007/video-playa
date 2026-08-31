.class public final synthetic Landroidx/work/impl/utils/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:Landroidx/work/impl/utils/WorkProgressUpdater;

.field public final synthetic r:Ljava/util/UUID;

.field public final synthetic s:Landroidx/work/Data;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/utils/WorkProgressUpdater;Ljava/util/UUID;Landroidx/work/Data;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/utils/d;->q:Landroidx/work/impl/utils/WorkProgressUpdater;

    iput-object p2, p0, Landroidx/work/impl/utils/d;->r:Ljava/util/UUID;

    iput-object p3, p0, Landroidx/work/impl/utils/d;->s:Landroidx/work/Data;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/utils/d;->r:Ljava/util/UUID;

    iget-object v1, p0, Landroidx/work/impl/utils/d;->s:Landroidx/work/Data;

    iget-object v2, p0, Landroidx/work/impl/utils/d;->q:Landroidx/work/impl/utils/WorkProgressUpdater;

    invoke-static {v2, v0, v1}, Landroidx/work/impl/utils/WorkProgressUpdater;->a(Landroidx/work/impl/utils/WorkProgressUpdater;Ljava/util/UUID;Landroidx/work/Data;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
