.class public final Landroidx/work/impl/model/WorkSpecDaoKt$dedup$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/model/WorkSpecDaoKt;->dedup(LP5/h;LM5/s;)LP5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LP5/h;"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeTransform$inlined:LP5/h;


# direct methods
.method public constructor <init>(LP5/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/model/WorkSpecDaoKt$dedup$$inlined$map$1;->$this_unsafeTransform$inlined:LP5/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public collect(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/model/WorkSpecDaoKt$dedup$$inlined$map$1;->$this_unsafeTransform$inlined:LP5/h;

    .line 2
    .line 3
    new-instance v1, Landroidx/work/impl/model/WorkSpecDaoKt$dedup$$inlined$map$1$2;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroidx/work/impl/model/WorkSpecDaoKt$dedup$$inlined$map$1$2;-><init>(LP5/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 13
    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 18
    .line 19
    return-object p1
.end method
