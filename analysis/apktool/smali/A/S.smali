.class public interface abstract LA/S;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lc0/m;
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    float-to-double v1, v0

    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmpl-double v1, v1, v3

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "invalid weight; must be greater than zero"

    .line 12
    .line 13
    invoke-static {v1}, LB/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(F)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method
