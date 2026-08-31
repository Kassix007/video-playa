.class public final Lp0/i;
.super Lp0/A;
.source "SourceFile"


# static fields
.field public static final c:Lp0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp0/i;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lp0/A;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp0/i;->c:Lp0/i;

    .line 8
    .line 9
    return-void
.end method
