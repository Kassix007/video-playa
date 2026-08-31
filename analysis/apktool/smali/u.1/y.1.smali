.class public abstract Lu/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu/t;

.field public static final b:LC0/Z0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lu/t;

    .line 2
    .line 3
    const v1, 0x3ecccccd    # 0.4f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const v3, 0x3e4ccccd    # 0.2f

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v3}, Lu/t;-><init>(FFF)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lu/y;->a:Lu/t;

    .line 14
    .line 15
    new-instance v0, Lu/t;

    .line 16
    .line 17
    invoke-direct {v0, v2, v2, v3}, Lu/t;-><init>(FFF)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lu/t;

    .line 21
    .line 22
    const/high16 v3, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3}, Lu/t;-><init>(FFF)V

    .line 25
    .line 26
    .line 27
    new-instance v0, LC0/Z0;

    .line 28
    .line 29
    const/16 v1, 0x18

    .line 30
    .line 31
    invoke-direct {v0, v1}, LC0/Z0;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lu/y;->b:LC0/Z0;

    .line 35
    .line 36
    return-void
.end method
